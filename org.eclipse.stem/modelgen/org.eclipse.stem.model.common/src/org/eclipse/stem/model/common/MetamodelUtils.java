package org.eclipse.stem.model.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.Model;

public final class MetamodelUtils 
{
	private MetamodelUtils() {}
	
	public static List<Compartment> getAllCompartmentsForGroup(
			CompartmentGroup cg) {
		List<Compartment> compartments = new ArrayList<Compartment>();
		if (cg != null) {
			compartments.addAll(getAllCompartmentsForGroup(cg.getParentGroup()));
			compartments.addAll(cg.getCompartments());

		}
		return compartments;
	}

	public static List<Compartment> getAllCompartmentsForModel(Model model) {
		return getAllCompartmentsForGroup(model.getCompartments());
	}
}
