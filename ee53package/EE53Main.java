package ee53package;

public class EE53Main {

	/**
	 * return the number of roll needed to reach a value
	 * 
	 * @param value
	 *            int value between 2 and 12 included
	 * @param pairOfDice
	 *            a pairOfDice value
	 * @return int value
	 */
	public static int countRollForValue(int value, EE51PairOfDice pairOfDice) {
		if (value < 2 || value > 12) {
			throw new IllegalArgumentException("la valeur entree doit etre comprise entre 2 et 12 inclus");
		}
		int count = 1;
		while (pairOfDice.getSum() != value) {
			pairOfDice.roll();
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		EE51PairOfDice pairOfDice = new EE51PairOfDice();
		EE52StatCalc calc;
		for (int i = 2; i <= 12; i++) {
			calc = new EE52StatCalc();
			for (int j = 0; j < 10000; j++) {
				calc.enter(countRollForValue(i, pairOfDice));
				pairOfDice.roll();
			}
			System.out.println("les données pour la valeur " + i + " : ");
			System.out.println("moyenne du nombre de lancer :" + calc.getMean());
			System.out.println("ecart-type du nombre de lancer : " + calc.getStandardDeviation());
			System.out.println("nombre max de lancer : " + calc.getMax());
			System.out.println();

		}
	}

}
