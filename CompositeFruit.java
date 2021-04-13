import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CompositeFruit extends Contenu {
	
	private boolean pepin = false;
	private String nom = "";
	
	private Collection lstCmp;
	
	public CompositeFruit() {
		lstCmp = new ArrayList();
	}
	
	public void ajouter(Contenu contenu) {
		lstCmp.add(contenu);
		if (contenu.getPepin())
			this.pepin = true;
	}
	
	public void supprimer(Contenu contenu) {
		lstCmp.remove(contenu);
	}
	

	@Override
	public Boolean getPepin() {
		// TODO Auto-generated method stub
		pepin = false;
		for (Object cmp : lstCmp) {
			if (((Contenu) cmp).getPepin())
				pepin = true;			
		}
		return pepin;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
        nom = "Panier (";
		
		for (Iterator i = lstCmp.iterator(); i.hasNext(); ) {
			Contenu contenu = (Contenu) i.next();
			nom += contenu.getNom() + " " ;			
		}

		nom = nom.trim() + ")";
		return nom;	
	}

}
