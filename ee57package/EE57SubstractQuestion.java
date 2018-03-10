package ee57package;

public class EE57SubstractQuestion implements EE57IntQuestion {
	private int a;// number of the problem
	private int b;// number of the problem

	public EE57SubstractQuestion() {
		a = (int) (Math.random() * 50 + 1);
		b = (int) (Math.random() * 50);
		
		if (a<b) {
			int swap=a;
			a=b;
			b=swap;
		}
		
	}

	@Override
	public String getQuestion() {
		return "What is " + a + " - " + b + " ?";
	}

	@Override
	public int getCorrectAnswer() {	
		return a - b;
	}

}
