package org.eclipse.stem.model.ctdl.serializer;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentReference;

public abstract class CompartmentTypeSerializers implements ITypeSerializer
{
	protected CompartmentReference compartmentReference;
	protected GenClass gc;
	public CompartmentTypeSerializers(CompartmentReference compartmentReference, GenClass gc) {
		this.gc = gc;
		this.compartmentReference = compartmentReference;
	}
	
	public static class EAttributeSerializer extends CompartmentTypeSerializers
	{
		public EAttributeSerializer(CompartmentReference compartment, GenClass gc) {
			super(compartment, gc);
		}
		
		public CharSequence serialize() {
			String compartmentName = compartmentReference.getName();
			GenFeature compartmentFeature = null;
			for (GenFeature feature : gc.getAllGenFeatures()) {
				if (feature.getName().equalsIgnoreCase(compartmentName)) {
					compartmentFeature = feature;
					break;
				}
			}
			
			if (compartmentFeature != null) {
				GenPackage genPackage = compartmentFeature.getGenPackage();
				GenModel genModel = gc.getGenModel();
				String qualifiedPackageName = genPackage.getReflectionPackageName() + "."+ genPackage.getPackageInterfaceName();
				String packageName = genModel.getImportedName(qualifiedPackageName);
				String serializedAccessor = packageName +".eINSTANCE.get"+ compartmentFeature.getFeatureAccessorName() +"()";
				return serializedAccessor;
				
				// genModel.getImportedName(targetFeatureGenPackage.getReflectionPackageName() +"."+ targetFeatureGenPackage.getPackageInterfaceName());
				//<%=sourceGenFeaturePackageImport%>.eINSTANCE.get<%=sourceGenFeature.getFeatureAccessorName()%>()
			}


			return "";
		}
	}

}
