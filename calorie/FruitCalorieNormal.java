import api.CaloriesNormal;

public class FruitCalorieNormal extends FruitCalorie {

	@Override
	public int calculCalories(String nom) {
		return CaloriesNormal.calculCalorie(nom);
	}
	
}
