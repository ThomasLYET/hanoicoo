// On utilise la version "non generique" de Comparable

public class Disque implements Comparable {
    private int val;

    public Disque (int v) {
	val = v;
    }

    public String toString() {
	return "Disque[" + val + "]";
    }

    public int compareTo(Object v) {
	/* A FAIRE */
    }
}
