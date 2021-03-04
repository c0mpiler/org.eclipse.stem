package org.eclipse.stem.fbd.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.stem.fbd.model.ConsumptionEvent;
import org.eclipse.stem.fbd.model.ContaminatedFood;

public class ZipCodeCapturer implements Observer {
		
		private List<String>zipCodes = new ArrayList<String>();
		
		public ZipCodeCapturer() {
			
		}

		@Override
		public void update(Observable o, Object arg) {
			ConsumptionEvent e = (ConsumptionEvent) arg;
			if (!(e.getFood() instanceof ContaminatedFood)) {
				// do nothing if food is not contaminated
				return;
			}
			zipCodes.add(e.getZip());
		}
		
		public List<String> getZips() {
			return zipCodes;
		}
	}