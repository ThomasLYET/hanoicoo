public class Tour extends Pile {
    
    public Tour(int capa) {
    }

    public void remplir(int nb) throws ErreurPile {
	for(int i = nb; nb > 0; nb--) 
	    super.empiler(new Disque(nb));
    }

    public void empiler(Object v) throws ErreurPile {
    }
}
