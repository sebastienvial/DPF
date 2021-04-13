
public class CaractereDeco extends Decorateur {
	
	private String caract;
	private final int NBR_CARACT = 10; 
	
	public CaractereDeco(Contenu cont, String caract) {
		contenu = cont;
		this.caract = caract;
	}
	
	public void afficherFruit() {
		for (int i=0; i<NBR_CARACT; i++) System.out.print(this.caract);
		System.out.println();
		System.out.println();
		contenu.afficherFruit();
		System.out.println();
		for (int i=0; i<NBR_CARACT; i++) System.out.print(this.caract);
	}
	


	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return contenu.getNom() ;
	}


	@Override
	public Boolean getPepin() {
		// TODO Auto-generated method stub
		return contenu.getPepin();
	}
	
}
