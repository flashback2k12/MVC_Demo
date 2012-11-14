package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.UebergabeModel;
import view.FirstGUI;
import view.SecoundGUI;

public class UebergabeController {

	private FirstGUI _view; 
	private SecoundGUI _view2;
	private UebergabeModel _model; 
	
	
	public UebergabeController() {
		
		this._view = new FirstGUI();
		this._view2 = new SecoundGUI(); 
		this._model = new UebergabeModel();
		
		addListener();
	}

	public void showView() {
		this._view.setVisible(true); 
	}
	
	private void addListener() {
		
		this.setDatenUebergabeListener(new DatenUebergabeListener()); 
		this.setOpenNewGUIListener(new OpenNewGUIListener());
	}
	
	class DatenUebergabeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String vorname = String.valueOf(_model.getName()); 
			
			_view2.setName(String.valueOf(_view2.getEingabe())); 
		}
	}
	
	class OpenNewGUIListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			_view.openGUI(); 
		}
	}
}
