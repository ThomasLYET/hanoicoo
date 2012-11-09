package main;

public class TourNommee extends Tour{
	private String nom;

	public TourNommee(int capa, String string) {
		super(capa);
		this.nom = string;
	}

	public void empiler(Object v) throws ErreurPile {
		super.empiler(v);
		System.out.println("Disque " + ((Disque)v).getVal() + " empile sur "+ this.nom);
	}

	public void depiler() throws ErreurPile {
		try{
			super.depiler();
			System.out.println("Disque " + ((Disque)this.sommet()).getVal() + " depile de "+ this.nom);
		}catch(ClassCastException e){ }

	}
	public void affiche(){
		System.out.println(this.nom +":");		
		super.affiche();
	}
}



