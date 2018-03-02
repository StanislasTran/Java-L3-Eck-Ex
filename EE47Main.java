
package mypackage;
import java.util.Scanner;

public class EE47Main {
	/**
	 * la variable first pointe vers  tableau des valeur à gauches dans les
	 * additions du quizz
	 */
	public static int[] first = new int[10];
	/**
	 * la variable second pointe vers le tableau des valeurs à droites dans les
	 * additions du quizz
	 */
	public static int[] second = new int[10];
	/**
	 * la variable rep contient les reponse entrees par l utilisateur
	 */
	public static int[] rep = new int[10];

	/**
	 * remplit les tableaux first et seconde de valeur entiere aleatoirement genere
	 * entre 1 et 100 inclus
	 */
	public static void creeQuizz() {
		for (int i = 0; i < first.length; i++) {
			first[i] = (int) (1 + Math.random() * 10);
			second[i] = (int) (1 + Math.random() * 10);
		}
	}
	
	/**
	*pose les questions du quizz et demande a l'utilisateur de repondre
	 */

	public static void adminQuizz() {
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<rep.length;i++) {
			System.out.println("Question"+i+1+"Combien font "+first[i]+"+"+second[i]+" ?");
			rep[i]=sc.nextInt();
		}
		sc.close();
	}
	
	/**
	 * affiche le resultat du quizz
	 */
	
	public static void gradQuizz() {
		System.out.println("resultat du quizz");
		for (int i=0;i<rep.length;i++) {
			System.out.println("Question"+i+1+"Combien font "+first[i]+"+"+second[i]+" ?");
			System.out.println("votre reponse : "+rep[i]);
			if(rep[i]==first[i]+second[i]) {
				System.out.println("bonne reponse");
				
			}else{
				System.out.println("la bonne reponse est : "+(first[i]+second[i]));
			}
		}
	}
	/**
	 * test le quizz 
	 */
	public static void testQuizz() {
		creeQuizz();
		adminQuizz();
		gradQuizz();
		
		
	}
	public static void main(String[] args) {
		testQuizz();
	}
}
