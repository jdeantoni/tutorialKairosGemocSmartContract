/*
 * generated by Xtext 2.24.0
 */
package fr.inria.kairos.tuto.simplelanguage.xtext.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractMLRuntimeModule;
import fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractMLStandaloneSetup;
import fr.inria.kairos.tuto.simplelanguage.xtext.ide.SmartContractMLIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class SmartContractMLWebSetup extends SmartContractMLStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SmartContractMLRuntimeModule(), new SmartContractMLIdeModule(), new SmartContractMLWebModule()));
	}
	
}
