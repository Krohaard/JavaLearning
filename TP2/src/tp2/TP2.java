/**
 * 
 */
package tp2;

import java.util.Scanner;
/**
 * 
 */
public class TP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float kNumber1;
		float kNumber2;
		float kResult;
		int kChoice;
		
		kResult=0;
		Scanner kInput = new Scanner(System.in);
		System.out.printf("Entrez le premier nombre :");
		kNumber1 = kInput.nextFloat();
		System.out.printf("Entrez le second nombre :");
		kNumber2 = kInput.nextFloat();
		do {
			System.out.printf("Choisissez une opération (0=Cancel, 1=Addition, 2=Soustraction, 3=Multiplication, 4=Division) :");
			kChoice = kInput.nextInt();			
		}
		while(kChoice < 0 || kChoice > 4);
		switch(kChoice) {
			case 1:
				//addition
				kResult=kNumber1+kNumber2;
				break;
			case 2:
				//Soustraction
				kResult=kNumber1-kNumber2;
				break;
			case 3:
				//Multiplication
				kResult=kNumber1*kNumber2;
				break;
			case 4:
				//Division
				if(kNumber2!=0) {
					kResult=kNumber1/kNumber2;
				}
				break;
			default:
		}
		if(kNumber2==0 && kChoice==4) {
			System.out.println("Division par 0 interdit");
		}else if(kChoice==0){
			System.out.println("Opération annulée");			
		}else {
			System.out.printf("Résultat : %.1f", kResult);			
		}
		kInput.close();
	}

}
