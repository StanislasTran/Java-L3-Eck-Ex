

public class EE36Main {
		//methode pour compte les diviseurs 
	    public static int nbDiviseur(int N){
	    	int nbDiviseur=2; //1 et N
	    	for (int i=2;i<N;i++) {
	    		if(N%i==0) {
	    			nbDiviseur++;
	    		}
	    	}
	    	return nbDiviseur;
	    }
	    
	public static void main(String[]args) {
		//nombre de diviseur maximum:
		int nbDivMax=2; 
		//nombre de diviseurs de chaque i dans la case i-1;
		int [] tabNbDivN=new int [10000];
		for (int i=1;i<=10000;i++) {
			tabNbDivN[i-1]=nbDiviseur(i);
			if(tabNbDivN[i-1]>nbDivMax) {
				nbDivMax=tabNbDivN[i-1];
			}
			
		}
		System.out.println("les nombres qui ont un maximum de diviseurs sont :");

		for(int j=0;j<tabNbDivN.length;j++) {
			if(tabNbDivN[j]==nbDivMax) {
				System.out.println(j+1);
			}
		}
		System.out.println("le nombre maximum de diviseur est: "+nbDivMax);
	}
}


