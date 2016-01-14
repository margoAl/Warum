package com.BaroM.client.chart;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.gwt.charts.client.ChartLoader;
import com.googlecode.gwt.charts.client.ChartPackage;
import com.googlecode.gwt.charts.client.ColumnType;
import com.googlecode.gwt.charts.client.DataTable;
import com.googlecode.gwt.charts.client.corechart.PieChart;
//Used GXT sample
public class Chart extends Widget {
	private SimpleLayoutPanel layoutPanel;
	private PieChart pieChart;
	static private Chart _instance = null;

	public Chart() {
		Window.enableScrolling(false);
		Window.setMargin("0px");

		RootLayoutPanel.get().add(getSimpleLayoutPanel());

		// Create the API Loader
		ChartLoader chartLoader = new ChartLoader(ChartPackage.CORECHART);
		chartLoader.loadApi(new Runnable() {

			@Override
			public void run() {
				getSimpleLayoutPanel().setWidget(getPieChart());
				drawPieChart();
			}
		});
	}

	private SimpleLayoutPanel getSimpleLayoutPanel() {
		if (layoutPanel == null) {
			layoutPanel = new SimpleLayoutPanel();
		}
		return layoutPanel;
	}

	private Widget getPieChart() {
		if (pieChart == null) {
			pieChart = new PieChart();
		}
		return pieChart;
	}

	private void drawPieChart() {
		// Prepare the data
		DataTable dataTable = DataTable.create();
		dataTable.addColumn(ColumnType.STRING, "Subject");
		dataTable.addColumn(ColumnType.NUMBER, "Number of students");
		dataTable.addRows(4);
		dataTable.setValue(0, 0, "Tootmine");
		dataTable.setValue(1, 0, "Juhtimine");
		dataTable.setValue(2, 0, "Turundus");
		dataTable.setValue(3, 0, "Logistika");
		dataTable.setValue(0, 1, 20);
		dataTable.setValue(1, 1, 25);
		dataTable.setValue(2, 1, 30);
		dataTable.setValue(3, 1, 35);

		// Draw the chart
		pieChart.draw(dataTable);
	}

	public static Widget getInstance() {
		if (null == _instance) {
			_instance = new Chart();
		}
		return _instance;

	}
	
	// Button btn4 = new Button("Tagasi");
	// btn4.addClickHandler(new ClickHandler() {
	// @Override
	// public void onClick(ClickEvent event) {
	// History.newItem("WorkPlaceOne", true);
	//
	// }
	//
	// });
	
}
