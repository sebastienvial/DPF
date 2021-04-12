
public class EtatCommandeEnvoyee implements EtatCommande{
	
	private Commande commande;
	
	public EtatCommandeEnvoyee(Commande commande) {
		this.commande = commande;
	}

	@Override
	public void traiterCommande(Commande commande) {
		// TODO Auto-generated method stub
		System.out.println("La commande a été envoyée");		
	}

}
