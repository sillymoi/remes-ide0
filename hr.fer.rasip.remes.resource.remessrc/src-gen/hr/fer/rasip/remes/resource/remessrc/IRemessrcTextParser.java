/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// A text parser parses a text into a tree of <code>EObject</code>s.
// It is associated with a <code>TextResource</code>.
public interface IRemessrcTextParser extends hr.fer.rasip.remes.resource.remessrc.IRemessrcConfigurable {
	
	// Parses the content given to the parser and create a tree
	// of EObjects. The root of this tree is wrapped together
	// with some commands that might be executed after parsing.
	//
	// @return the result of the parse process
	public hr.fer.rasip.remes.resource.remessrc.IRemessrcParseResult parse();
	
	// Parses the document and returns a list of expected elements.
	// Each expected element covers a range in the input stream.
	//
	// If the parser implementation can not determine expected
	// elements null can be returned.
	// This method is used by the code completion to figure out
	// which proposals can be shown to users for a given cursor
	// position.
	//
	// The class 'type' is used as start symbol.
	public java.util.List<hr.fer.rasip.remes.resource.remessrc.mopp.RemessrcExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, hr.fer.rasip.remes.resource.remessrc.IRemessrcTextResource dummyResource);
	
	// Signals the parse to terminates the parsing as soon as possible.
	public void terminate();
}
