

import java.util.Scanner;
import java.util.ArrayList;

public class E1 {

	/**
	 * demande à l'utilisateur d'entrer 2 series de valeur et en affiche 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> liste1 = new ArrayList<Integer>();// premiere serie de valeurs
		ArrayList<Integer> liste2 = new ArrayList<Integer>();// deuxieme serie de valeurs
		ArrayList<Integer> liste3 = new ArrayList<Integer>();// 1e serie de valeurs affichées
		ArrayList<Integer> liste4 = new ArrayList<Integer>();// 2e serie de valeurs affichée
		System.out.println("entrez une valeur");
		int valueEntre = sc.nextInt();
		while (valueEntre != 0) {
			liste1.add(valueEntre);
			System.out.println("entrez une valeur");
			valueEntre = sc.nextInt();

		}
		System.out.println("entrez une valeur");
		valueEntre = sc.nextInt();
		while (valueEntre != 0) {
			liste2.add(valueEntre);
			System.out.println("entrez une valeur");
			valueEntre = sc.nextInt();
		}
		for (int i = 0; i < liste1.size(); i++) {
			if (!liste3.contains(liste1.get(i))) {
				liste3.add(liste1.get(i));
				System.out.print(liste1.get(i) + ", ");
			}

		}
		System.out.println();

		for (int j = 0; j < liste2.size(); j++) {
			if (!liste4.contains(liste2.get(j))) {
				liste4.add(liste2.get(j));
				System.out.print(liste2.get(j) + ", ");
			}

		}
		System.out.println();

		for (int k = 0; k < liste3.size(); k++) {
			System.out.print(liste3.get(k) + ", ");

		}
		for (int l = 0; l < liste4.size(); l++) {
			if (!liste3.contains(liste4.get(l))) {

				System.out.print(liste4.get(l) + ", ");
			}

		}

	}
}
