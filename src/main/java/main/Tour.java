package main;



public class Tour extends Pile{
	public Tour(int capa) {
		super(capa);
	}

	public void remplir(int nb) throws ErreurPile {
		for(int i = nb; i > 0; i--) 
			this.empiler(new Disque(i));
	}

	public void empiler(Object v) throws ErreurPile {
		try{		
			if(this.estVide() || (((Disque)this.sommet()).compareTo((Disque)v)>0)) super.empiler((Disque)v);
			else throw new ErreurTour("le sommet est plus petit que le disque a empiler!!");
		}catch(ClassCastException e){
			System.out.println("Ops! l'objet a empiler n'est pas un disque, la tour rejete");//le cas ou la tour est vide et v#disque
		}

	}

}
