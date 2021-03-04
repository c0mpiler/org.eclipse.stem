package org.eclipse.stem.model.ui.actions;

import org.eclipse.core.expressions.PropertyTester;

public class BundleInstallTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		System.out.println("in bundle install property tester");
		return false;
	}

}
