package model;

public class UebergabeModel {

		String _name; 
		
		public UebergabeModel() {
			zur�ckSetzen();
		}
		
		public void zur�ckSetzen() {
			this._name = "";
		}

		public String getName() {
			return this._name;
		}

		public void setName(String _name) {
			this._name = _name;
		}
		
		
	}

