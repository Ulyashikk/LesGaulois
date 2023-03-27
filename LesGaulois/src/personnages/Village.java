package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois){
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int index) {
		return villageois[index];
	}
	
	public void afficherVillageois() {
		System.out.printf("Dans village du chef " + chef.getNom() + "vivent les legendaires gaulois :" + "\n");
		for (int i = 0; i<nbVillageois; i++) System.out.printf("- " + villageois[i].getNom() + "\n");
	}
	
	
	public static void main(String[] args){
		Village village = new Village("Village des Irréductibles", 30);
		Chef Abraracourcix = new Chef("Abraracourcix", 6, 1, village);
		village.setChef(Abraracourcix);
		Gaulois Asterix = new Gaulois("Asterix", 8, village);
		village.ajouterHabitant(Asterix);
		Gaulois Obelix = new Gaulois("Obelix", 25, village);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
	}

	
}