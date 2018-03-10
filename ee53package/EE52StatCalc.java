package ee53package;

public class EE52StatCalc {
	/**
	 * An object of class StatCalc can be used to compute several simple statistics
	 * for a set of numbers. Numbers are entered into the dataset using the
	 * enter(double) method. Methods are provided to return the following statistics
	 * for the set of numbers that have been entered: The number of items, the sum
	 * of the items, the average, and the standard deviation
	 */

	private int count; // Number of numbers that have been entered.
	private double sum; // The sum of all the items that have been entered.
	private double squareSum; // The sum of the squares of all the items.
	private double max;// The maximum value
	private double min;// The minimum value;

	/**
	 * Add a number to the dataset. The statistics will be computed for all the
	 * numbers that have been added to the dataset using this method.
	 */
	public void enter(double num) {
		count++;
		sum += num;
		squareSum += num * num;
		if (count == 0) {
			max = num;
			min = num;
		} else {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
	}

	/**
	 * Return the number of items that have been entered into the dataset.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Return the sum of all the numbers that have been entered.
	 */
	public double getSum() {
		return sum;
	}

	/**
	 * Return the average of all the items that have been entered. The return value
	 * is Double.NaN if no numbers have been entered.
	 */
	public double getMean() {
		return sum / count;
	}

	/**
	 * Return the standard deviation of all the items that have been entered. The
	 * return value is Double.NaN if no numbers have been entered.
	 */
	public double getStandardDeviation() {
		double mean = getMean();
		return Math.sqrt(squareSum / count - mean * mean);
	}

	/**
	 * Return the minimum value of all the items that have been entered.
	 * 
	 * @return value is Double. 0 if no numbers have been entered
	 */
	public double getMin() {
		return min;
	}

	/**
	 * Return the minimum value of all the items that have been entered.
	 * 
	 * @return value is Double. 0 if no numbers have been entered
	 */
	public double getMax() {
		return max;
	}

	@Override
	public String toString() {
		return "il y a " + this.getCount() + "\n valeurs , la moyenne est " + this.getMean() + "\n l'ecart type est "
				+ this.getStandardDeviation() + "\n la somme des valeurs est : " + this.getSum() + "\n la valeur max est : "
				+ this.getMax() + "\n la valeur min est : " + this.getMin();

	}

} // end class StatCalc
