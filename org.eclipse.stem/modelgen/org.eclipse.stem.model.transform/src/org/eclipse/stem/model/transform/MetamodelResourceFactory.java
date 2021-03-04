/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.transform;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;

/**
 * EMF Resource Factory for seamlessly loading STEM metamodel definitions. This
 * class resolves URIs by checking for resources in the local workspace before
 * passing on the option to the plugin.
 */
public class MetamodelResourceFactory extends ResourceFactoryImpl {

	public static class MetamodelURIHandler extends
			URIHandlerImpl.PlatformSchemeAware {
		@Override
		public URI deresolve(URI uri) {
			return super.deresolve(uri);
		}

		@Override
		public URI resolve(URI uri) {

			if (uri.isPlatform()) {
				if (uri.isPlatformPlugin()) {
					uri = URI.createPlatformResourceURI(
							uri.toPlatformString(true), true).appendFragment(
							uri.fragment());
				}
				if (uri.isPlatformResource()) {
					IPath workspacePath = new Path(uri.toPlatformString(true));
					IFile file = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(workspacePath);
					if (!file.exists()) {
						uri = URI.createPlatformPluginURI(
								uri.toPlatformString(true), true)
								.appendFragment(uri.fragment());
					}
				}
			}
			return super.resolve(uri);
		}
	}

	@Override
	public Resource createResource(URI uri) {
		XMLResource resource = new XMIResourceImpl(uri) {
			@Override
			protected boolean useIDs() {
				return eObjectToIDMap != null || idToEObjectMap != null;
			}

			@Override
			protected XMLHelper createXMLHelper() {
				return new XMLHelperImpl(this) {

					@Override
					public String getHREF(EObject obj) {
						return super.getHREF(obj);
					}

				};
			}
		};

		resource.setEncoding("UTF-8");

		resource.getDefaultSaveOptions().put(
				XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, 80);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER,
				new MetamodelURIHandler());
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_URI_HANDLER,
				new MetamodelURIHandler());

		return resource;
	}

}