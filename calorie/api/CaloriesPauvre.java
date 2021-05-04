package api;

import java.util.Observable;

import util.Util;

public class CaloriesPauvre extends Observable{
	
	private static int indice = 1;
	
	public static int calculCalorie(String nom) {
		return Util.calculCalorie(nom) * indice;
	}

	public void changeCalculCalorie() {
		CaloriesPauvre.indice = 2; 
		updateFruit("pauvre");
	}
	
	public void updateFruit(String typeCalorie) {
		setChanged();
		notifyObservers(typeCalorie);
	}

}
