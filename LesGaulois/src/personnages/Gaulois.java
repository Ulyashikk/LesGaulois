package personnages;

public class Gaulois {
	
	private String nom;
	private int effetPotion = 1;
	private int force, nb_trophees = 0;
	private Equipement trophees[] = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() { return nom; }
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + String.valueOf(forcePotion) + " fois decuplee");
	}
	
	public void faireUneDonation(Musee musee) {
		if (nb_trophees > 0) parler("Je donne au musee tous mes trophees :");
		for (int i = 0;i<nb_trophees;i++) {
			musee.donnerTrophee(this, trophees[i]);
			System.out.println("-" + trophees[i].toString());
			trophees[i] = null;
		}
		nb_trophees = 0;
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force
	+ "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("WOUHOU");
		Romain romain = new Romain("Romain",1);
		asterix.frapper(romain);
		asterix.boirePotion(3);
	}
}

