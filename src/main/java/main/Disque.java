package main;

public class Disque implements Comparable {
	private int val;

	public Disque (int v) {
		val = v;
	}

	public String toString() {
		return "Disque[" + val + "]";
	}

	public int compareTo(Object v) {
		try{
			Disque d=(Disque)v;
			if(this.val<d.val) return -1;
			else if(this.val==d.val) return 0;
			else return 1;
		}catch(ClassCastException e){throw e; }
	}
	
	public int getVal(){
		return val;
	}

}
