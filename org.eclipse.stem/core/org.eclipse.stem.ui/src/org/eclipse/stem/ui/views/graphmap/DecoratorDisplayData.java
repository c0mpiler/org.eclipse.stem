package org.eclipse.stem.ui.views.graphmap;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProvider;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;

/**
 * This class is used to hold data used to display the relative values of a
 * {@link Decorator}. Instances of this class are created when the label values
 * of a {@link Decorator} are first drawn and then subsequently cached in
 * {@link #decoratorToDecoratorDisplayDataMap} for future retrieval.
 */
public class DecoratorDisplayData {	

	//private LatLongProviderAdapter latLongProvider;

	private Map<Node, LatLong> nodeData;

	private boolean hasAllLatLong;

	/**
	 * Default constructor
	 */
	public DecoratorDisplayData() {
		nodeData = new HashMap<Node, LatLong>();
		hasAllLatLong = true;
	}

	/**
	 * @return <code>true</code> if all of the labels have valid
	 *         latitude/longitude data retrieved.
	 */
	public boolean hasAllLatLong() {
		return hasAllLatLong;
	}

	/**
	 * @return the label data for the decorator
	 */
	public Map<Node, LatLong> getNodeData() {
		return nodeData;
	}

	/**
	 * Go through each of the label data entries and try to retrieve the ones
	 * that do not have lat/long data yet.
	 * 
	 * @param monitor
	 *            progress monitor
	 */
	public void updateLatLong(IProgressMonitor monitor) {
		boolean latLongMissing = false;
		
		for (Map.Entry<Node, LatLong> entry : nodeData.entrySet()) {
			
			final LatLongProviderAdapter latLongProvider = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE
					.adapt(entry.getKey(), LatLongProvider.class);
			
			//latLongProvider.setTarget(entry.getKey());
			
			LatLong data = latLongProvider.getLatLong();			
			
			if (data != null && data.size() != 0) {
				entry.setValue(data);
			} else {
				latLongMissing = true;
			}
		}
		
		hasAllLatLong = !latLongMissing;
	}

	/**
	 * @param label
	 *            a {@link DynamicNodeLabel} to add to the set.
	 */
	public void addNode(Node node) {
		hasAllLatLong = false;
		nodeData.put(node, null);
	} // addLabel

	/**
	 * @param latLongProvider
	 *            the {@link LatLongProviderAdapter} that will provide the
	 *            latitude/longitude data for the labels.
	 */
//	public void setLatLongProviderAdapter(LatLongProviderAdapter latLongProvider) {
//		this.latLongProvider = latLongProvider;
//	}
	
}
