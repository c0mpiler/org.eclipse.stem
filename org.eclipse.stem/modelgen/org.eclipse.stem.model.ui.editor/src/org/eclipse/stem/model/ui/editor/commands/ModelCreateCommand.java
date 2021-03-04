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
package org.eclipse.stem.model.ui.editor.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.ui.editor.VisualModelReconciler;
import org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;

public class ModelCreateCommand extends Command 
{
	private CanvasPackage canvas;
	private ModelElement modelElement;
	
	public ModelCreateCommand(CanvasPackage canvas, Model model) {
		
		this.canvas = canvas;
		this.modelElement = VisualModelReconciler.initializeModelElement(model);
		
	}
	
	public ModelCreateCommand(CanvasPackage canvas, ModelElement modelElement)
	{
		this.canvas = canvas;
		this.modelElement = modelElement;
		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return canvas != null && modelElement != null;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		redo();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		canvas.getModelElements().add(modelElement);
		
		
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		canvas.getModelElements().remove(modelElement);
	}

}
