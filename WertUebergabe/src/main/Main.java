package main;

import controller.UebergabeController;

public class Main {

	static UebergabeController controller;
	
	public static void main(String[] args) {
		
		controller = new UebergabeController();
		
		controller.showView(); 
		

	}

}
