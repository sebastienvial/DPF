import java.util.Observable;
import java.util.Observer;

public class Fruit extends Contenu implements Observer{
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
	
	public void afficherCalories() {
		//afficher la valeur calorique du fruit
		if (this.calorie == null)
			System.out.println("Calcul de calories non disponible");
		else
			System.out.println(calorie.calculCalories(this.nom) + " calories");
	}	

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if ( ((this.calorie instanceof FruitCalorieEnrichi) && ((String)arg1 == "enrichi" )) |
			 ((this.calorie instanceof FruitCalorieNormal) && ((String)arg1 == "normal" )) |
			 ((this.calorie instanceof FruitCaloriePauvre) && ((String)arg1 == "pauvre" )) )	{
			System.out.println(this.getNom() + " : Nouvel apport calorifique " + (String)arg1 );
			afficherCalories();
		} else
			System.out.println(this.getNom() + " : Nouvel apport calorifique " + (String)arg1 + " n''a pas d''impact sur ce fruit");
			
		
	}

}

