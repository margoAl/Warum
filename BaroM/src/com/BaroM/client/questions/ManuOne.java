package com.BaroM.client.questions;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class ManuOne extends Composite {

	// Widget composed from other widgets
	private VerticalPanel vPanel = new VerticalPanel();
	static private ManuOne instance = null;
	private ArrayList manuResult;

	public ManuOne() {

		initWidget(this.vPanel);
		
		vPanel.setBorderWidth(1);
		//Questions for questionnaire
		final String[] ManuOnequestions = { "Kui palju aega kulub t\u00f6\u00f6operatsiooni l\u00e4bi viimiseks?",
				"Kui palju aega kulub materjali ja t\u00f6\u00f6vahendite leidmiseks?",
				"Kui palju aega kulub t\u00f6\u00f6riistade eelseadistuseks?",
				"Kui palju aega on seotud vahetult t\u00f6\u00f6tlemisega?",
				"Kui palju aega kulub t\u00f6\u00f6de l\u00f6petamiseks ja \u00fcleandmiseks?",
				"Kui palju aega kulub praagi avastamiseks ja eemaldamiseks?",
				"Kui palju aega kulub kvaliteedi tagamiseks?" };
		//Answers for questions 
		final String[] RadioButtons = { "Pisut", "Keskmiselt", "Palju" };

		//Creating questionnaire with answers
		for (int i = 0; i < ManuOnequestions.length; i++) {
			final Label questions1 = new Label(ManuOnequestions[i]);
			vPanel.add(questions1);
			vPanel.setSpacing(3);
			for (int j = 0; j < RadioButtons.length; j++) {
				final RadioButton radioButton = new RadioButton("Radio" + i, RadioButtons[j]);
				vPanel.add(radioButton);

			}

		}
		//Listener to finding choice
		
		
		//Array for storing answers
		manuResult = new ArrayList();
		
	
		
		//Buttons for navigation

		Button button = new Button("Salvesta ja edasi!");
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				History.newItem("WorkPlaceOne", true);
										

			}
			
		});
		vPanel.add(button);
		vPanel.add(html);
	}

	HTML html = new HTML("This is made by <b>Margo Allik</b>", true);
	
	
	public static Widget getInstance() {
		if (null == instance) {
			instance = new ManuOne();
		}
		return instance;
	}
}
