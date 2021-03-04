/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/
package org.eclipse.stem.model.ctdl.ui.embed;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.stem.model.ctdl.ContextSensitiveResourceWrapper;
import org.eclipse.stem.model.ctdl.scoping.CTDLScopeProvider;
import org.eclipse.stem.model.ctdl.scoping.MetamodelContextLinker;
import org.eclipse.stem.model.ctdl.ui.internal.CTDLActivator;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.metamodel.provider.TransitionItemProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocumentContentObserver;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class EmbeddedExpressionEditorComposite extends Composite {
	protected EmbeddedEditorFactory factory;
	protected EmbeddedEditorFactory.Builder builder;
	protected EmbeddedEditor embeddedEditor;
	protected EmbeddedEditorModelAccess partialEditorModelAccess;

	// protected XtextResource resource;
	// protected IEditedResourceProvider resourceProvider;
	protected ILinkingService linker;
	protected Injector injector;

	protected Transition transition;
	protected EditingDomain editingDomain;
	protected boolean edited = false;
	// protected Button applyButton, revertButton;
	// private boolean dirty = false;
	protected TransitionItemProvider itemProvider;
	
	protected final IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {
		public XtextResource createResource() {
			XtextResourceSet resourceSet = new XtextResourceSet();
			XtextResource resource = (XtextResource) resourceSet
					.createResource(URI.createURI("empty.sctd"));
			resourceSet.getResources().add(resource);
			return resource;
		}
	};

	protected final XtextResource emptyResource = resourceProvider
			.createResource();

	public EmbeddedExpressionEditorComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		setupEditor();
		// setupEditorButtons();
	}

	public void setTransition(Transition transition, EditingDomain editingDomain) {
		if (this.transition == transition) {
			return;
		}

		if (transition == null) {
			this.transition = null;
			embeddedEditor.getDocument().setInput(
					resourceProvider.createResource());
			embeddedEditor.getDocument().set("");
			embeddedEditor.getViewer().getTextWidget().setEditable(true);
		} else {
			this.transition = transition;
			this.editingDomain = editingDomain;

			itemProvider = (TransitionItemProvider) ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory().adapt(transition,
							IItemPropertySource.class);

			if (itemProvider != null) {
				itemProvider.addListener(new INotifyChangedListener() {

					@Override
					public void notifyChanged(final Notification notification) {
						if (notification.getEventType() == Notification.SET
								&& notification.getFeature() == MetamodelPackage.Literals.TRANSITION__EXPRESSION) {
							StyledText txt2 = embeddedEditor.getViewer()
									.getTextWidget();
							if (txt2 != null && !txt2.isFocusControl()) {

								embeddedEditor.getDocument().set(
										notification.getNewStringValue());
							}

						}

					}
				});
			}

			XtextResource newResource = resourceProvider.createResource();

			String expr = transition.getExpression();
			if (expr == null) {
				expr = "";
			}
//			if (!isNullOrEmpty(expr)) {
//				//embeddedEditor.getDocument().set("");
//				//embeddedEditor.getDocument().set(expr);
//			} else {
//				//embeddedEditor.getDocument().set("");
//			}
			
			
			ByteArrayInputStream bais = new ByteArrayInputStream(expr.getBytes());
			try {
				newResource.load(bais,Collections.emptyMap());
				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			
			transition.setExpressionResource(newResource);

			MetamodelContextLinker linker = (MetamodelContextLinker) ((LazyLinkingResource) newResource)
					.getLinkingService();
			linker.setTransition(transition);
			if (linker.getScopeProvider() instanceof CTDLScopeProvider) {
				((CTDLScopeProvider) linker.getScopeProvider())
						.setTransition(transition);
			}

			if (newResource instanceof ContextSensitiveResourceWrapper) {
				((ContextSensitiveResourceWrapper) newResource)
						.setTransition(transition);
			}

			if (newResource != null
					&& newResource instanceof LazyLinkingResource
					&& ((LazyLinkingResource) newResource).getLinkingService() instanceof MetamodelContextLinker) {

			}
			
			embeddedEditor.getDocument();

			embeddedEditor.getDocument().setInput(newResource);
			embeddedEditor.getDocument().set(expr);
			
			embeddedEditor.getViewer().getTextWidget().setEditable(true);
			flagDirty(false);
		}
	}

	public void setTransition(Transition transition) {
		setTransition(transition, null);
	}

	static boolean isNullOrEmpty(String s) {
		return (s == null || "".equals(s.trim()));
	}

	public void verifySaveChanges() {
		if (isDirty()) {
			if (MessageDialog.openConfirm(getShell(), "Sure?",
					"Do you wish to save the current transition?")) {
				applyChanges();
			} else {
				revertChanges();
			}
		}
	}

	protected void applyChanges() {
		final XtextDocument doc = getDocument();
		if (doc != null && transition != null) {

			if (editingDomain != null) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						editingDomain
								.getCommandStack()
								.execute(
										SetCommand
												.create(editingDomain,
														transition,
														MetamodelPackage.Literals.TRANSITION__EXPRESSION,
														doc.get()));

					}
				});

			} else {
				transition.setExpression(doc.get());
			}
		}
		flagDirty(false);
	}

	protected void revertChanges() {
		XtextDocument doc = getDocument();
		if (doc != null && transition != null) {
			doc.set(transition.getExpression());
		}
		flagDirty(false);
	}


	protected XtextDocument getDocument() {
		return embeddedEditor.getDocument();
	}

	public boolean isDirty() {
		return false;
	}

	protected void flagDirty(boolean dirty) {
		// this.dirty = dirty;
		// if (dirty) {
		// enableButtons();
		// } else {
		// disableButtons();
		// }
	}


	protected void setupEditor() {
		Composite editorCanvas = new Composite(this, SWT.NONE);
		GridData canvasData = new GridData(GridData.FILL_BOTH);
		canvasData.horizontalSpan = 2;
		editorCanvas.setLayoutData(canvasData);
		editorCanvas.setLayout(new GridLayout());
		CTDLActivator activator = CTDLActivator.getInstance();
		injector = activator
				.getInjector(CTDLActivator.ORG_ECLIPSE_STEM_MODEL_CTDL_CTDL);
		factory = injector.getInstance(EmbeddedEditorFactory.class);

		linker = (ILinkingService) injector.getInstance(ILinkingService.class);
		builder = factory.newEditor(resourceProvider);

		embeddedEditor = builder
				.processIssuesBy(new EmbeddedEditorIssueProcessor())
				.showErrorAndWarningAnnotations().withParent(editorCanvas);
		partialEditorModelAccess = embeddedEditor.createPartialEditor(true);

		embeddedEditor.getDocument().addModelListener(
				new IXtextModelListener() {

					@Override
					public void modelChanged(XtextResource resource) {
						if (edited) {
							String contents = getDocument().get();
							if (contents != null
									&& !contents.equals(transition
											.getExpression())) {
								applyChanges();
							}
							edited = false;
						}
					}
				});

		embeddedEditor.getDocument().addXtextDocumentContentObserver(
				new IXtextDocumentContentObserver() {

					@Override
					public void documentChanged(DocumentEvent event) {
						// flagDirty(true);
						edited = true;
					}

					@Override
					public void documentAboutToBeChanged(DocumentEvent event) {
					}

					@Override
					public boolean performNecessaryUpdates(Processor processor) {
						return true;
					}

					@Override
					public boolean hasPendingUpdates() {
						// TODO Auto-generated method stub
						return false;
					}
				});
	}

	private class EmbeddedEditorIssueProcessor implements
			IValidationIssueProcessor {

		@Override
		public void processIssues(List<Issue> issues, IProgressMonitor monitor) {
			for (Issue issue : issues) {
				System.err.println(issue.getMessage());
			}

		}

	}
}
