package main;

public class TourNommee extends Tour {
	
	private String nom;
	
	public TourNommee(int capa, String string) {
		super(capa);
		this.nom = string;
	}
	
	public void empiler(Object v) throws ErreurPile {
		super.empiler(v);
		Disque d = (Disque) v;
		System.out.println("Disque " + d.getVal() + " empilé sur "+ this.nom);
	}
	
	public void depiler() throws ErreurPile {
		super.depiler();
		Disque d = (Disque) this.sommet();
		System.out.println("Disque " + d.getVal() + " depilé de "+ this.nom);
	}
}
