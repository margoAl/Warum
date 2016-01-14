package com.BaroM.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BaroM implements EntryPoint {

	public void onModuleLoad() {

		String startToken = History.getToken();

		if (startToken.length() == 0) {
			History.newItem("ManuOne");
		}

		History.addValueChangeHandler(new MyHistoryListener());
		History.fireCurrentHistoryState();
	}
}
