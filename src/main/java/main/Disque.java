package main;

// On utilise la version "non generique" de Comparable

@SuppressWarnings("rawtypes")
public class Disque implements Comparable {
    private int val;

    public Disque (int v) {
    	val = v;
    }

    public int getVal() {
		return val;
	}

	public String toString() {
    	return "Disque[" + val + "]";
    }

    public int compareTo(Object v) {
    	try {
    		Disque d = (Disque) v;
    		if ( this.val < d.getVal() ) return -1;
    		if ( this.val == d.getVal() ) return 0;
    		return 1;
    	} catch ( ClassCastException e) { throw e; }
    }
}
