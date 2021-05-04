package labo3;

import api.CaloriesEnrichi;

public class ClientLabo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Labo3 task1
		String typeMenu = "vapeur";

		LegumeFactory legFactory = new LegumeFactory();
		Legume l1 =  legFactory.getLegume(typeMenu);
		
		System.out.println(l1.getType());
		
		
		//Labo3 task2
		MenuFactory menu1 = MenuFactory.getMenuFactory("vapeur");
		
		System.out.println(menu1.getLegume().getType());
		System.out.println(menu1.getHuile().getType());
		System.out.println(menu1.getHerbe().getType());
		
		MenuFactory menu2 = MenuFactory.getMenuFactory("salade");
		
		System.out.println(menu2.getLegume().getType());
		System.out.println(menu2.getHuile().getType());
		System.out.println(menu2.getHerbe().getType());
		
		
		
		
	}

}
