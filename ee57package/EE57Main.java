package ee57package;

import java.util.Scanner;

public class EE57Main  {
	
	private static EE57IntQuestion [] questions;
	private static int [] reponses;
	public static  EE57IntQuestion [] createQuizz() {
		questions=new EE57IntQuestion [10];
		for(int i=0;i<5;i++) {
			questions[i]=new EE56AdditionQuestion();
		}
		for (int j=5;j<10;j++) {
			questions[j]=new EE57SubstractQuestion();
		}
	
		return questions;
		
		
	}
	
	public static void main(String[]args) {
		reponses= new int[10];
		createQuizz();
		Scanner sc=new Scanner(System.in);
		int goodAnswer=0;
		for (int i=0;i<questions.length;i++) {
			System.out.println(questions[i].getQuestion());
			reponses[i]=sc.nextInt();
		}
		
		for (int j = 0; j < questions.length; j++) {
			if (questions[j].getCorrectAnswer() != reponses[j]) {
				System.out.println("question " + (j + 1) + " the answer is " + questions[j].getCorrectAnswer());

			} else {
				goodAnswer++;
				System.out.println("question " + (j + 1) + "correct");

			}
		}
		System.out.println("you have "+goodAnswer+" good answers");
		sc.close();
	}
	
	
}
