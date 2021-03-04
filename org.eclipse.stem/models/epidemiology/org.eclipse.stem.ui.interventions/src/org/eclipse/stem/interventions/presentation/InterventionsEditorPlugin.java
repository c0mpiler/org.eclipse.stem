package org.eclipse.stem.interventions.presentation;


import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.stem.core.common.provider.CoreEditPlugin;
import org.eclipse.stem.graphgenerators.provider.GraphgeneratorEditPlugin;
import org.eclipse.stem.ui.interventions.adapters.ControlGraphGeneratorPropertyEditorAdapterFactory;
import org.eclipse.stem.ui.interventions.adapters.ControlPropertyStringProviderAdapterFactory;

/**
 * This is the central singleton for the Interventions editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class InterventionsEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InterventionsEditorPlugin INSTANCE = new InterventionsEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsEditorPlugin() {
		super
			(new ResourceLocator [] {
				CoreEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE,
				GraphgeneratorEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
			// Need to register
			new ControlGraphGeneratorPropertyEditorAdapterFactory();
			new ControlPropertyStringProviderAdapterFactory();
		}
	}

}