
public class Client {

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit();
		fruit1.setNom("pomme");
		fruit1.setPepin(true);
		
		Fruit fruit2 = new Fruit();
		fruit2.setNom("fraise");
		fruit2.setPepin(false);
		
		fruit1.afficherFruit();
		fruit2.afficherFruit();
		fruit2.afficherCalories();
		
		//Tache2
		FruitCalorie cal = new FruitCaloriePauvre();
		Fruit fruit3 = new Fruit(cal, "kiwi", true);
		fruit3.afficherFruit();
		fruit3.afficherCalories();
		
		cal = new FruitCalorieNormal();
		Fruit fruit4 = new Fruit(cal, "orange", true);
		fruit4.afficherFruit();
		fruit4.afficherCalories();
		
		cal = new FruitCalorieEnrichi();
		Fruit fruit5 = new Fruit(cal, "banane", false);
		fruit5.afficherFruit();
		fruit5.afficherCalories();
		
		//Tache3
		Commande maCommande = Commande.creerCommande();
		
		maCommande.ajoutFruit(fruit3);
		maCommande.afficherCommande();
		
		maCommande.ajoutFruit(fruit2);
		maCommande.ajoutFruit(fruit4);
		maCommande.ajoutFruit(fruit4);
		maCommande.ajoutFruit(fruit5);
		maCommande.ajoutFruit(fruit5);
		
		
		System.out.println();
		Commande maCommande2 = Commande.creerCommande();
		maCommande2.ajoutFruit(fruit2);
		
		
		
	}

}
