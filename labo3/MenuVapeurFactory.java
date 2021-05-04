package labo3;

public class MenuVapeurFactory extends MenuFactory {
	
	@Override
	public Legume getLegume() {
		// TODO Auto-generated method stub
		return new LegumeVapeur();
	}

	@Override
	public Huile getHuile() {
		// TODO Auto-generated method stub
		return new HuileVapeur();
	}

	@Override
	public Herbe getHerbe() {
		// TODO Auto-generated method stub
		return new HerbeVapeur();
	}
	
	

}
