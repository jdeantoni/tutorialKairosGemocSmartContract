/*
 * generated by Xtext 2.24.0
 */
package fr.inria.kairos.tuto.simplelanguage.xtext.ui;

import com.google.inject.Injector;
import fr.inria.kairos.tuto.simplelanguage.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmartContractMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(XtextActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		XtextActivator activator = XtextActivator.getInstance();
		return activator != null ? activator.getInjector(XtextActivator.FR_INRIA_KAIROS_TUTO_SIMPLELANGUAGE_XTEXT_SMARTCONTRACTML) : null;
	}

}
