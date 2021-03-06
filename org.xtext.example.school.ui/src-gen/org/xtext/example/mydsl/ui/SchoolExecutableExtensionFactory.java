/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.school.ui.internal.SchoolActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SchoolExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SchoolActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SchoolActivator.getInstance().getInjector(SchoolActivator.ORG_XTEXT_EXAMPLE_MYDSL_SCHOOL);
	}
	
}
