/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

// A basic implementation of the ILocationMap interface. Instances
// store information about element locations using four maps.
// <p>
// The set-methods can be called multiple times by the parser that may visit
// multiple children from which it copies the localization information for the parent
// (i.e., the element for which set-method is called)
// It implements the following behavior:
// <p>
// Line:   The lowest of all sources is used for target<br>
// Column: The lowest of all sources is used for target<br>
// Start:  The lowest of all sources is used for target<br>
// End:    The highest of all sources is used for target<br>
//
public class RemessrcLocationMap implements hr.fer.rasip.remes.resource.remessrc.IRemessrcLocationMap {
	
	// A basic interface that can be implemented to select
	// EObjects based of their location in a text resource.
	public interface ISelector {
		boolean accept(int startOffset, int endOffset);
	}
	
	protected org.eclipse.emf.common.util.EMap<org.eclipse.emf.ecore.EObject, Integer> columnMap = new org.eclipse.emf.common.util.BasicEMap<org.eclipse.emf.ecore.EObject, Integer>();
	protected org.eclipse.emf.common.util.EMap<org.eclipse.emf.ecore.EObject, Integer> lineMap = new org.eclipse.emf.common.util.BasicEMap<org.eclipse.emf.ecore.EObject, Integer>();
	protected org.eclipse.emf.common.util.EMap<org.eclipse.emf.ecore.EObject, Integer> charStartMap = new org.eclipse.emf.common.util.BasicEMap<org.eclipse.emf.ecore.EObject, Integer>();
	protected org.eclipse.emf.common.util.EMap<org.eclipse.emf.ecore.EObject, Integer> charEndMap = new org.eclipse.emf.common.util.BasicEMap<org.eclipse.emf.ecore.EObject, Integer>();
	
	public void setLine(org.eclipse.emf.ecore.EObject element, int line) {
		setMapValueToMin(lineMap, element, line);
	}
	
	public int getLine(org.eclipse.emf.ecore.EObject element) {
		return getMapValue(lineMap, element);
	}
	
	public void setColumn(org.eclipse.emf.ecore.EObject element, int column) {
		setMapValueToMin(columnMap, element, column);
	}
	
	public int getColumn(org.eclipse.emf.ecore.EObject element) {
		return getMapValue(columnMap, element);
	}
	
	public void setCharStart(org.eclipse.emf.ecore.EObject element, int charStart) {
		setMapValueToMin(charStartMap, element, charStart);
	}
	
	public int getCharStart(org.eclipse.emf.ecore.EObject element) {
		return getMapValue(charStartMap, element);
	}
	
	public void setCharEnd(org.eclipse.emf.ecore.EObject element, int charEnd) {
		setMapValueToMax(charEndMap, element, charEnd);
	}
	
	public int getCharEnd(org.eclipse.emf.ecore.EObject element) {
		return getMapValue(charEndMap, element);
	}
	
	private int getMapValue(org.eclipse.emf.common.util.EMap<org.eclipse.emf.ecore.EObject, Integer> map, org.eclipse.emf.ecore.EObject element) {
		if (!map.containsKey(element)) return -1;
		java.lang.Integer value = map.get(element);
		return value == null ? -1 : value.intValue();
	}
	
	private void setMapValueToMin(org.eclipse.emf.common.util.EMap<org.eclipse.emf.ecore.EObject, Integer> map, org.eclipse.emf.ecore.EObject element, int value) {
		// we need to synchronize the write access, because other threads may iterate
		// over the map concurrently
		synchronized (this) {
			if (element == null || value < 0) return;
			if (map.containsKey(element) && map.get(element) < value) return;
			map.put(element, value);
		}
	}
	
	private void setMapValueToMax(org.eclipse.emf.common.util.EMap<org.eclipse.emf.ecore.EObject, Integer> map, org.eclipse.emf.ecore.EObject element, int value) {
		// we need to synchronize the write access, because other threads may iterate
		// over the map concurrently
		synchronized (this) {
			if (element == null || value < 0) return;
			if (map.containsKey(element) && map.get(element) > value) return;
			map.put(element, value);
		}
	}
	
	public java.util.List<org.eclipse.emf.ecore.EObject> getElementsAt(final int documentOffset) {
		java.util.List<org.eclipse.emf.ecore.EObject> result = getElements(new ISelector() {
			public boolean accept(int start, int end) {
				return start <= documentOffset && end >= documentOffset;
			}
		});
		return result;
	}
	
	public java.util.List<org.eclipse.emf.ecore.EObject> getElementsBetween(final int startOffset, final int endOffset) {
		java.util.List<org.eclipse.emf.ecore.EObject> result = getElements(new ISelector() {
			public boolean accept(int start, int end) {
				return start >= startOffset && end <= endOffset;
			}
		});
		return result;
	}
	
	private java.util.List<org.eclipse.emf.ecore.EObject> getElements(ISelector s) {
		// there might be more than one element at the given offset
		// thus, we collect all of them and sort them afterwards
		java.util.List<org.eclipse.emf.ecore.EObject> result = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		
		// we need to synchronize the iteration over the map, because
		// other threads may write to the map concurrently
		synchronized (this) {
			for (org.eclipse.emf.ecore.EObject next : charStartMap.keySet()) {
				java.lang.Integer start = charStartMap.get(next);
				java.lang.Integer end = charEndMap.get(next);
				if (start == null || end == null) {
					continue;
				}
				if (s.accept(start, end)) {
					result.add(next);
				}
			}
		}
		java.util.Collections.sort(result, new java.util.Comparator<org.eclipse.emf.ecore.EObject>() {
			public int compare(org.eclipse.emf.ecore.EObject objectA, org.eclipse.emf.ecore.EObject objectB) {
				int lengthA = getCharEnd(objectA) - getCharStart(objectA);
				int lengthB = getCharEnd(objectB) - getCharStart(objectB);
				return lengthA - lengthB;
			}
		});
		return result;
	}
}
