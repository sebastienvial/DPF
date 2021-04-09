
public class Fruit implements Contenu{
	
	private String nom;
	private Boolean pepin;
	private FruitCalorie calorie;
	
	public Fruit() {
		
	}

	public Fruit(FruitCalorie calorie, String nom, Boolean pepin) {
		super();
		this.nom = nom;
		this.pepin = pepin;
		this.calorie = calorie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Boolean getPepin() {
		return pepin;
	}

	public void setPepin(Boolean pepin) {
		this.pepin = pepin;
	}
	
	@Override
	public void afficherFruit() {
		System.out.println("Fruit [nom=" + nom + ", pepin=" + pepin + "]");		
	}
	
	public void afficherCalories() {
		//afficher la valeur calorique du fruit
		if (this.calorie == null)
			System.out.println("Calcul de calories non disponible");
		else
			System.out.println(calorie.calculCalories(this.nom) + " calories");
	}	 

}
