package org.eclipse.stem.core;

public class PerfTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		STEMObjectPool pool = new STEMObjectPool(10, 5) {
			
			@Override
			protected Object createNewObject() {
				return new String();
			}

			@Override
			protected void resetObject(Object o) {
				
			}
		};
		long now = System.nanoTime();
		Object o;
		for(int i=0;i<1000000;++i)
			o = new String();
		long then = System.nanoTime();
		System.out.println("Total time: "+(then-now));
		
		now = System.nanoTime();
		for(int i=0;i<1000000;++i) {
			o = pool.get();
			pool.release(o);
		}
		then = System.nanoTime();
		System.out.println("Total time 2: "+(then-now));
		
	}

}
