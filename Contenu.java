
public abstract class  Contenu {
	
	public void afficherFruit() {
		System.out.println("Fruit [nom=" + getNom() + ", pepin=" + getPepin() + "]");	
	};
	
	public abstract Boolean getPepin();
		
	public abstract String getNom();
	

}
