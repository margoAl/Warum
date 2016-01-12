package com.BaroM.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BaroM implements EntryPoint {

	public void onModuleLoad() {

		//HTML html = new HTML("This is made by <b>Margo Allik</b>", true);

		// Add them to the root panel.
		//VerticalPanel panel = new VerticalPanel();

		//panel.add(html);
		//RootPanel.get().add(panel);
		
		
		    	String startToken = History.getToken();
		    	
			    if (startToken.length() == 0) {
			      History.newItem("ManuOne");
			    }
			    
		    	History.addValueChangeHandler(new MyHistoryListener());
	    	History.fireCurrentHistoryState(); 
		    }
		}
		 
// ManuOne pageMO = new ManuOne();
// RootPanel.get().add(pageMO);
//
// WorkPlaceOne pageWPO = new WorkPlaceOne();
// RootPanel.get().add(pageWPO);
//
//// Chart pageChart = new Chart();
//// RootPanel.get().add(pageChart);
//
// }
// }

// VerticalPanel vpanel = new VerticalPanel();
//
// // Create radio buttons, .
// RadioButton radioButton1 = new RadioButton("manuf", "Pisut");
// RadioButton radioButton2 = new RadioButton("manuf", "Keskmiselt");
// RadioButton radioButton3 = new RadioButton("manuf", "Palju");
//
// // Check 'First' by default.
// HorizontalPanel panel = new HorizontalPanel();
// panel.setSpacing(10);
//
// // Create question.
//
// Label Lbl = new Label(" Kui palju aega kulub?");
// Label Lbl1 = new Label(" Kuidas?");
// Label Lbl2 = new Label(" kas?");
//
// panel.add(Lbl);
// panel.add(Lbl1);
// panel.add(radioButton1);
// panel.add(radioButton2);
// panel.add(radioButton3);
// panel.add(Lbl2);
// panel.add(radioButton1);
// panel.add(radioButton2);
// panel.add(radioButton3);
//
// vpanel.add(panel);

// MyFormDialog dialog = new MyFormDialog(shell);
// dialog.create();
// dialog.getShell().setSize(500, 500);
// dialog.open();
//
// FormPanel formPanel = new FormPanel();
// FormElement.as(formPanel.getElement()).setAcceptCharset("UTF-8");
//
// formPanel.setMethod(FormPanel.METHOD_POST);
// formPanel.setVisible(true);
// RootPanel.get().add(formPanel);
// formPanel.submit();
// formPanel.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
// @Override
// public void onSubmitComplete(SubmitCompleteEvent event) {
// String results = event.getResults();
// }
// });
//
// // Valitud RadioButtoni selgitamine
// int manusum = 0;
//
// if (radioButton1.getValue() == true) {
// manusum++;
// }
// ;
//
// // Create a FormPanel and point it at a service.
// final FormPanel form = new FormPanel();
// form.setAction("/myFormHandler");
//
// // Create submit button.
// panel.add(new Button("Vasta", new ClickHandler() {
// public void onClick(ClickEvent event) {
// form.submit();
// }
// }));

// panel.setBorderWidth(1);
// RootPanel.get().add(vpanel);
// RootPanel.get().add(Lbl1);
// RootPanel.get().add(Lbl2);
//
// RootPanel.get("gwtContainer").add(panel);
