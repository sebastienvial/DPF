package api;

import java.util.Observable;

import util.Util;

public class CaloriesNormal extends Observable {
	
	private static int indice = 10;

	public static int calculCalorie(String nom) {
		return Util.calculCalorie(nom) * indice;
	}

	public void changeCalculCalorie() {
		CaloriesNormal.indice = 11; 
		updateFruit("normal");
	}
	
	public void updateFruit(String typeCalorie) {
		setChanged();
		notifyObservers(typeCalorie);
	}

}
