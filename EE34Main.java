import java.util.Scanner;
public class EE34Main {
	
	public static boolean estUnApostrophe(String ch,int i) {
		if(ch.charAt(i)=='\'' ){
		char caractereAvant=' ';
		char caractereApres=' ';
			if (ch.length()>i-1 && ch.length()>0) {
				caractereAvant=ch.charAt(i-1);
				caractereApres=ch.charAt(i+1);
			}
			return Character.isLetter(caractereAvant)
					&&Character.isLetter(caractereApres);
		}	
			
				return false;
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entrez votre phrase (n'oubliez pas le point final)");
		String ch=sc.nextLine();
		String word="";
		char caractereI;
		for(int i=0;i<ch.length();i++) {
			caractereI=ch.charAt(i);
			if(Character.isLetter(caractereI)
					||estUnApostrophe(ch,i)){
				word+=caractereI;
			}else {
				System.out.println(word);
				word=""; 
			}
		}
		sc.close();
		
	}
}
