package labo3;

public class MenuCuissonFactory extends MenuFactory {

	@Override
	public Legume getLegume() {
		// TODO Auto-generated method stub
		return new LegumeCuisson();
	}

	@Override
	public Huile getHuile() {
		// TODO Auto-generated method stub
		return new HuileCuisson();
	}

	@Override
	public Herbe getHerbe() {
		// TODO Auto-generated method stub
		return new HerbeCuisson();
	}

}
