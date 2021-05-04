package api;



import java.util.Observable;

import util.Util;

public class CaloriesEnrichi extends Observable{
	
	private static int indice = 100;

	public static int calculCalorie(String nom) {
		return Util.calculCalorie(nom) * indice;
	}

	public void changeCalculCalorie() {
		CaloriesEnrichi.indice = 101; 
		updateFruit("enrichi");
	}
	
	public void updateFruit(String typeCalorie) {
		setChanged();
		notifyObservers(typeCalorie);
	}
}
