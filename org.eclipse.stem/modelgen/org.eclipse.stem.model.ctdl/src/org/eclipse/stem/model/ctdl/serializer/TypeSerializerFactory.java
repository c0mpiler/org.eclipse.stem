package org.eclipse.stem.model.ctdl.serializer;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentReference;
import org.eclipse.stem.model.ctdl.serializer.CompartmentTypeSerializers.EAttributeSerializer;

public class TypeSerializerFactory {

	
	public static ITypeSerializer getSerializer(EObject obj, Class<?> expectedType, GenClass gc) {
		if (obj instanceof CompartmentReference && expectedType == EAttribute.class) {
			return new EAttributeSerializer((CompartmentReference)obj, gc);
		}
		return null;
	}
	
}
