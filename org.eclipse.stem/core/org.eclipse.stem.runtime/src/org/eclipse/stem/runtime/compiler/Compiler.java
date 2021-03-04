package org.eclipse.stem.runtime.compiler;

import org.eclipse.stem.jobs.execution.IExecutable;
import org.eclipse.stem.runtime.compactjava.RuntimeExecutable;

/**
 * Interface implemented by compilers
 * @author edlund
 *
 */
public interface Compiler {

	public RuntimeExecutable compile(IExecutable executable);
}
