package org.eclipse.stem.runtime.compactjava;


/**
 * Runtime executable. Contains a runtime scenario (or experiment, automated experiment etc)
 * @author edlund
 *
 */
public class RuntimeExecutable implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RuntimeIdentifiable executable;
	
	public void setExecutable(RuntimeIdentifiable ri) {
		executable = ri;
	}

	public RuntimeIdentifiable getExecutable() {
		return executable;
	}

}
