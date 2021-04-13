public class EtatCommandePayee implements EtatCommande {
	
	private final Commande commande;
	
	public EtatCommandePayee(Commande commande) {
		this.commande = commande;
	}

	@Override
	public void traiterCommande(Commande commande) {
		// TODO Auto-generated method stub
		System.out.println("La commande a �t� trait�e");
		commande.setEtat(new EtatCommandeEnvoyee(commande));
		
	}

}
