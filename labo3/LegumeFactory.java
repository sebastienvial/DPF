package labo3;

public class LegumeFactory {
	
	public LegumeFactory() {
		
	}
	
	public Legume getLegume(String menuType) {
		
		switch(menuType) {
		
			case "salade":
				return new LegumeSalade();
			case "potage":
				return new LegumePotage();
			case "vapeur":
				return new LegumeVapeur();
			case "cuisson":
				return new LegumeCuisson();
			default:
				return null;
		}
			
	}

	

}
