package org.eclipse.stem.ui.handlers;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter;
import org.eclipse.stem.jobs.execution.IExecutable;
import org.eclipse.stem.runtime.compactjava.RuntimeExecutable;
import org.eclipse.stem.runtime.compiler.compactjava.CompactJavaCompiler;

public class CompileCommandHandler extends STEMExecutionCommandHandler {


	@Override
	protected void doit(IExecutable executable) {
		System.out.println("Compiling "+((ExecutableAdapter)executable).getTarget());
		
		CompactJavaCompiler sc = new CompactJavaCompiler();
		RuntimeExecutable re = sc.compile(executable);
		
		
		// Serialize it to disk
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialized.obj"));
			oos.writeObject(re);
			oos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
	}

}
