package exo2;
import java.util.ArrayList;

public class Pile {

	private int capacite;
	// L'index 0 correspond au sommet de la pile
	private ArrayList listDisque;

	public Pile(int capa) {
		this.capacite = capa; 
		this.listDisque = new ArrayList();
	}

	// Une pile ne prend pas en compte la relation d'ordre des objets !
	public void empiler(Object v) throws ErreurPile {
		if (this.listDisque.size() == this.capacite) {
			throw new ErreurPile("La Pile est pleine !");
		}
		else {
			// On met l'objet sur le sommet de la pile, et non à sa queue
			this.listDisque.add(0, v);
		}
	}

	// La fonction depiler ne depile que le premier element de la pile
	public void depiler() throws ErreurPile {
		if (this.estVide()) {
			throw new ErreurPile("La Pile est vide !");
		}
		this.listDisque.remove(0);
	}

	public Object sommet() throws ErreurPile {
		if ( this.estVide() ) {
			throw new ErreurPile("La Pile est vide !");
		}
		return this.listDisque.get(0);
	}

	public boolean estVide() {
		if ( this.listDisque.size() == 0 ) { return true;}
		return false;
	}

	public int hauteur() {
		return this.listDisque.size();
	}

	public int capacite () {
		return this.capacite;
	}

	/* Affiche les elements de la pile dans l'ordre en commencant par le
	 * plus petit element
	 */
	// Ici, n'affiche que dans l'ordre où ont été mis les éléments dans la liste
	public void affiche () { 
		for (int i = 0; i < this.listDisque.size(); i++) {
			System.out.println( this.listDisque.get(i).toString());
		}
	}
}
