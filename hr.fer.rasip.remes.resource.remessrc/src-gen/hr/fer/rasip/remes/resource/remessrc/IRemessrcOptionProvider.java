/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc;

// Implementors of this interface can provide options that
// are used when resources are loaded.
public interface IRemessrcOptionProvider {
	
	// The name of the attribute of the default_load_options
	// extension point that specifies to which resources an
	// option provider applies.
	public static final String CS_NAME = "csName";
	
	// Returns a map of options. The keys are the names of the
	// options, the values are arbitrary object that provide
	// additional information or logic for the option.
	public java.util.Map<?,?> getOptions();
}
