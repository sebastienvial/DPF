import api.CaloriesPauvre;

public class FruitCaloriePauvre extends FruitCalorie {

	@Override
	public int calculCalories(String nom) {
		return CaloriesPauvre.calculCalorie(nom);
	}
	
}
