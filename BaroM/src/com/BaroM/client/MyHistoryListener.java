package com.BaroM.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.RootPanel;

public class MyHistoryListener implements ValueChangeHandler<String> {

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		System.out.println("Current State : " + event.getValue());
		
		if (event.getValue().equals("ManuOne")){
    		RootPanel.get().clear();
    		RootPanel.get().add(ManuOne.getInstance());
		}
		
		if (event.getValue().equals("WorkPlaceOne")){
    		RootPanel.get().clear();
    		RootPanel.get().add(WorkPlaceOne.getInstance());
		}	
		if (event.getValue().equals("Chart")){
			RootPanel.get().clear();
    		RootPanel.get().add(Chart.getInstance());
				}
	}

}
