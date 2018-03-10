package ee53package;

public class EE51PairOfDice {
	private int die1 = 0; // Number showing on the first die.
	private int die2 = 0; // Number showing on the second die.
	
	
	public EE51PairOfDice() {
		roll();
	}
	/**
	 * 
	 * @return la valeur du premier de
	 */
	public int getDie1() {
		return die1;
	}
	
	/**
	 * 
	 * @return la valeur du second de
	 */
	
	public int getDie2() {
		return die2;
	}
	
	@Override 
	public String toString () {
		return this.toString()+" valeur de1 : "+die1+" valeur de2 : "+die2;
	}
	
	public void roll() {
		// Roll the dice by setting each of the dice to be
		// a random number between 1 and 6.
		die1 = (int) (Math.random() * 6) + 1;
		die2 = (int) (Math.random() * 6) + 1;
	}// end class PairOfDice
	
	/** 
	 * returne la somme des valleurs des 2 des
	 * @return int value
	 */
	public int getSum() {
		return die1+die2;
	}
}
