package ee57package;

public class EE56AdditionQuestion implements EE57IntQuestion{

	private int a, b; // The numbers in the problem.

	public EE56AdditionQuestion() { // constructor
		a = (int) (Math.random() * 50 + 1);
		b = (int) (Math.random() * 50);
	}

	public String getQuestion() {
		return "What is " + a + " + " + b + " ?";
	}

	public int getCorrectAnswer() {
		return a + b;
	}
}
