package labo3;

public abstract class MenuFactory {
	
	public static MenuFactory getMenuFactory(String typeMenu) {
		
		if (typeMenu.equals("cuisson")) return new MenuCuissonFactory();
		 else
		   if (typeMenu.equals("potage")) return new MenuPotageFactory();
		   else
			   if (typeMenu.equals("salade")) return new MenuSaladeFactory();
			   else
				   if (typeMenu.equals("vapeur")) return new MenuVapeurFactory();
				   else return null;
	}
	
	public abstract Legume getLegume();
	public abstract Huile getHuile();
	public abstract Herbe getHerbe();

}
