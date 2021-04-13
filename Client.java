
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
		maCommande.ajoutFruit(fruit5);
		
		
		System.out.println();
		Commande maCommande2 = Commande.creerCommande();
		maCommande2.ajoutFruit(fruit2);
		
		System.out.println();
		//ajout de fruit dans le panier
		
		CompositeFruit pf1 = new CompositeFruit();
		
		pf1.ajouter(fruit1);
		pf1.ajouter(fruit4);
		pf1.ajouter(fruit4);
		pf1.ajouter(fruit5);
		pf1.ajouter(fruit3);
		pf1.ajouter(fruit2);
		pf1.ajouter(fruit1);
		pf1.ajouter(fruit4);
		
		//pf1.afficherFruit();
		
		CompositeFruit pf2 = new CompositeFruit();
		pf2.ajouter(fruit3);
		//pf2.afficherFruit();
		
		CompositeFruit big = new CompositeFruit();
		big.ajouter(pf1);
		big.ajouter(fruit4);
		big.ajouter(pf2);
		big.afficherFruit();
		
		
		Contenu contenu = new Fruit(cal,"Framboise",true);		
		contenu = new CaractereDeco(contenu,"*");		
		contenu.afficherFruit();
		
		CompositeFruit c2 = new CompositeFruit();
		
		
		//Lab2 task3
		System.out.println();
		System.out.println("Premier état");
		maCommande.traiterCommande();
		System.out.println("Deuxième état");
		maCommande.traiterCommande();
		System.out.println("Troisième état");
		maCommande.traiterCommande();
		maCommande.traiterCommande();
		
		
		
	}

}
