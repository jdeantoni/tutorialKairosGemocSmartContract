/*
 * generated by Xtext 2.24.0
 */
package fr.inria.kairos.tuto.simplelanguage.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SmartContractMLStandaloneSetup extends SmartContractMLStandaloneSetupGenerated {

	public static void doSetup() {
		new SmartContractMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
