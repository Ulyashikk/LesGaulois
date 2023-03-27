package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private Village village;
	
	public Gaulois(String nom, int force, Village village) {
		this.nom = nom;
		this.force = force;
		this.village = village;
	}

	public String getNom() { return nom; }
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
	+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
	+ "]";
	}
	
	public static void main(String[] args) {
		
//		Gaulois Asterix = new Gaulois("Astérix", 8, village);
//		Romain Minus = new Romain("Minus", 6);
//
//	    Asterix.parler("Bonjour à tous");
//	    Minus.parler("UN GAU... UN GAUGAU...");
//	    Asterix.frapper(Minus);
//	    Asterix.frapper(Minus);
//	    Asterix.frapper(Minus);
}
}

