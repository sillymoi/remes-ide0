/*
* generated by Xtext
*/
package hr.fer.rasip.remes.profile;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ProfileUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return hr.fer.rasip.remes.profile.ui.internal.ProfileActivator.getInstance().getInjector("hr.fer.rasip.remes.profile.Profile");
	}
	
}
