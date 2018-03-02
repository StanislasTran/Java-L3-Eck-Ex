package mypackage ;

public class EE43Main {
	/**  simule un lance de de et retourne sa valeur
	 * @return une valeur entiere enre 1 et 6
	 */
	public static int lanceDe() {
		return (int)(1+Math.random()*(6));
	}
	
	/** retourne le nombre de lancer simuler pour obtenir la valeur value entree
	 * @param value valeur entiere comprise entre 2 et 12 inclus
	 * @return une valeur entiere
	 */
	public static int countRollForValue(int value) {
		if(value<2 || value>12) {
			throw new IllegalArgumentException("la valeur entree doit etre comprise entre 2 et 12 inclus");
		}
		int countLancer=0;
		int de1=0;
		int de2=0;
		
		while (de1+de2 !=value ) {
			countLancer++;
			de1=lanceDe();
			de2=lanceDe();
		}
		
		return countLancer;
	}
	
	
/** test la fonction countRollForValu pour la valeur 2
 * affiche le resultat de countRollForValue(2)
 */
	public static void  countForSnakeEyes() {
		System.out.println(countRollForValue(2));
	}
	
	public static void main(String[] args) {
		countForSnakeEyes();
	}

}
