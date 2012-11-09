package exo2;

public class MesEntiers2 implements Empilable {
	Integer val;

	public MesEntiers2(int v) {
		val = v;
	}

	public void init(int nb) {
		val = new Integer(nb);
	}

	public int compareTo(Object v) {
		MesEntiers m = (MesEntiers) v;
		return val.compareTo(m.val);
	}

	public String toString() {
		return "MesEntiers[" + val.intValue() +"]";
	}

	@Override
	public void setVal(int v) {
		this.val = v;
	}
}

