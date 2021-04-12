import api.CaloriesEnrichi;

public class FruitCalorieEnrichi extends FruitCalorie{
	
	@Override
	public int calculCalories (String nom) {
		return CaloriesEnrichi.calculCalorie(nom);
	}
	
}
