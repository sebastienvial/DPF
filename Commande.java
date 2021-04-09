import java.util.ArrayList;

public final class Commande {
	
	private static Commande instance = null;
	
	private ArrayList<Fruit> tabFruits = new ArrayList<Fruit>();
	private final int MAX_FRUITS = 5;
	
	private Commande() {
		super();		
	}
	
	public final synchronized static Commande creerCommande() {
		if (Commande.instance == null)
			Commande.instance = new Commande();
		return Commande.instance;		
	}
	
	public void ajoutFruit(Fruit fruit) {
		if (tabFruits.size() < MAX_FRUITS)
			this.tabFruits.add(fruit);
		else {
			System.out.println(" Le nombre de fruits pour la commande est atteint");
			this.afficherCommande();
		}
	}

	public void afficherCommande() {
		System.out.println("Contenu de la commande");
		for (Fruit fruit  :tabFruits) {
			System.out.print(fruit.getNom() + (fruit.getPepin()? " avec pépins" : " sans pépins") +  ", ");
			fruit.afficherCalories();			
		}
	}
}
