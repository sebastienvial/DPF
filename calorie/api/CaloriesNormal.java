package api;

import util.Util;

public class CaloriesNormal {

	public static int calculCalorie(String nom) {
		return Util.calculCalorie(nom) * 10;
	}

}
