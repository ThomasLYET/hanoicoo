package exo2;
import java.util.Scanner;

public class TestHanoi {
	static public void main (String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entrer le nom de la classe pour les disques: ");
		/* retourne le prochain mot sur l'entree standard, on se limitera
		 * a quelques chose qui ressemble a un nom de classe
		 */
		String name = scan.next("\\w+");
		Hanoi h = null;
		try {
			h = new Hanoi(6, /* ?? */);
		} catch (ErreurPile e) {
			System.out.println(e.getMessage());
		} catch (ClassCastException e) {
			System.out.println("ClassCastException: " + e.getMessage());
		}
		if (h != null) {
			System.out.println("Situation initiale:");
			h.affiche();
			h.jouer();
			System.out.println("Situation finale:");
			h.affiche();
		}
	}
}
