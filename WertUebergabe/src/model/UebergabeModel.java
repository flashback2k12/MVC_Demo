package model;

public class UebergabeModel {

		String _name; 
		
		public UebergabeModel() {
			zurückSetzen();
		}
		
		public void zurückSetzen() {
			this._name = "";
		}

		public String getName() {
			return this._name;
		}

		public void setName(String _name) {
			this._name = _name;
		}
		
		
	}

