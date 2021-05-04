package labo3;

public class MenuPotageFactory extends MenuFactory {

	@Override
	public Legume getLegume() {
		// TODO Auto-generated method stub
		return new LegumePotage();
	}

	@Override
	public Huile getHuile() {
		// TODO Auto-generated method stub
		return new HuilePotage();
	}

	@Override
	public Herbe getHerbe() {
		// TODO Auto-generated method stub
		return new HerbePotage();
	}

}
