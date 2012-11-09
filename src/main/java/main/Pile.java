package main;

import java.util.ArrayList;



public class Pile {
	private int capacite;
	private ArrayList listelem;

	public Pile(int capa) {
		capacite=capa;
		listelem=new ArrayList();
	}

	public void empiler(Object v) throws ErreurPile {
		try{
			if(listelem.size()<this.capacite) 
				listelem.add(0,v);
			else throw new ErreurPile("Pile Pleine!!!");
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}

	public void depiler () throws ErreurPile {
		if(!this.estVide()) listelem.remove(0);
		else throw new ErreurPile("Pile vide!!!");
	}

	public Object sommet() throws ErreurPile {
		if(!this.estVide()) return listelem.get(0);
		else return new ErreurPile("Pile Vide!");
	}

	public boolean estVide() {
		if(listelem.size()==0) return true;
		return false;
	}

	public int hauteur () {
		return listelem.size();
	}

	public int capacite () {
		return capacite;
	}

	public void affiche () { 
		/* Affiche les elements de la pile dans l'ordre en commencant par le
		 * plus petit element
		 */
		for(int i=0;i<listelem.size();i++)
			System.out.println(listelem.get(i).toString());
	}
}
