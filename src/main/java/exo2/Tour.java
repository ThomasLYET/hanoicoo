package exo2;

public class Tour extends Pile {

	public Tour(int capa) {
		super(capa);
	}

	public void remplir(int nb) throws ErreurPile {
		for(int i = nb; i > 0; i--) 
			this.empiler(new Disque(i));
	}

	public void empiler(Object v) throws ErreurPile {
		try {
			Disque sommet = (Disque) this.sommet();
			if (sommet.compareTo(v) == 1) { super.empiler(v); }
			else {
				throw new ErreurTour("Le Disque est plus gros que le sommet !");
			}
		} catch (ClassCastException e) {}
	}
}
