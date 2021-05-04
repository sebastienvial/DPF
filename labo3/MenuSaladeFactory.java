package labo3;

public class MenuSaladeFactory extends MenuFactory {

	@Override
	public Legume getLegume() {
		// TODO Auto-generated method stub
		return new LegumeSalade();
	}

	@Override
	public Huile getHuile() {
		// TODO Auto-generated method stub
		return new HuileSalade();
	}

	@Override
	public Herbe getHerbe() {
		// TODO Auto-generated method stub
		return new HerbeSalade();
	}

}
