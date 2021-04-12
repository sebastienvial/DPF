package api;

import util.Util;

public class CaloriesEnrichi {

	public static int calculCalorie(String nom) {
		return Util.calculCalorie(nom) * 100;
	}

}
