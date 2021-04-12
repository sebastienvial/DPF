
public class EtatCommandeEnAttente implements EtatCommande {
	
	private final Commande commande;
	
	public EtatCommandeEnAttente(Commande commande) {
		this.commande = commande;
	}

	@Override
	public void traiterCommande(Commande commande) {
		// TODO Auto-generated method stub
		commande.setEtat(new EtatCommandePayee(commande));
		
	}

}
