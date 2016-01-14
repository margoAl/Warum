package com.BaroM.client.questions;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class WorkPlaceOne extends Composite {

	private VerticalPanel vPanel = new VerticalPanel();
	static private WorkPlaceOne inst = null;
	private ArrayList<Integer> wpoResult; 

	public WorkPlaceOne() {

		initWidget(this.vPanel);

		vPanel.setBorderWidth(1);
		//Questions for questionnaire
		final String[] questions = { "Kui kaua v\u00f6tab aega t\u00f6\u00f6 alustamine t\u00f6\u00f6kohal?",
				"Kui palju kulub aega seoses ebasobivate t\u00f6\u00f6v\u00f6tetega?",
				"Kui palju kulub aega seoses seadme t\u00fchi k\u00e4iguga?",
				"Kui palju v\u00e4hendab toote kvaliteedikontroll masinaaja osat\u00e4htust?",
				"Kui palju kulub aega praaktoote korrigeerimisele?",
				"Kui palju kulub aega seoses t\u00f6\u00f6koha halva korrashoiuga?",
				"Kui palju kulub aega, muudele t\u00f6\u00f6ga mitteseotud tegevustele?" };

		{
			//Creating questionnaire with answers
			for (int i = 0; i < questions.length; i++) {

				final Label questions1 = new Label(questions[i]);
				vPanel.add(questions1);
				vPanel.setSpacing(3);
				RadioButton radioButton1 = new RadioButton("manuf", "Pisut");
				RadioButton radioButton2 = new RadioButton("manuf", "Keskmiselt");
				RadioButton radioButton3 = new RadioButton("manuf", "Palju");
				vPanel.add(radioButton1);
				vPanel.add(radioButton2);
				vPanel.add(radioButton3);
				
				//Checking the chosen answers 
				radioButton1.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						boolean checked = ((CheckBox) event.getSource()).getValue();
						Window.alert("It is R1" + (checked ? "" : "not ") + "checked");
						wpoResult.add(2);
						 

					}
				});
				radioButton2.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						boolean checked = ((CheckBox) event.getSource()).getValue();
						Window.alert("It is R2" + (checked ? "" : "not ") + "checked");
						wpoResult.add(2);

					}
				});
				radioButton3.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						boolean checked = ((CheckBox) event.getSource()).getFormValue() != null;
						Window.alert("It is R3" + (checked ? "" : "not ") + "checked");
						wpoResult.add(3);
					}
				});

			}

			HorizontalPanel hPanel = new HorizontalPanel();
			hPanel.setBorderWidth(1);
			// Array for storing values
			
			wpoResult = new ArrayList();
			//Buttons for navigation
			Button btn2 = new Button("Salvesta ja edasi!");
			btn2.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					History.newItem("Chart", true);

				}

			});

			Button btn3 = new Button("Tagasi");
			btn3.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					History.newItem("ManuOne", true);

				}

			});
			hPanel.add(btn2);
			hPanel.add(btn3);
			vPanel.add(hPanel);

		}

	}

	public static Widget getInstance() {
		if (null == inst) {
			inst = new WorkPlaceOne();
		}
		// TODO Auto-generated method stub
		return inst;
	}
}
