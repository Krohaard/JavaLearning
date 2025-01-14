package tp8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TP8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float kNumber1;
		float kNumber2;
		float kResult;
		int kChoice;
		
		kResult=0;
		Scanner kInput = new Scanner(System.in);
		try {
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
					kResult=kNumber1/kNumber2;
					break;
				default:
			}
			if(kChoice==0){
				System.out.println("Opération annulée");			
			}else {
				System.out.printf("Résultat : %.1f", kResult);			
			}
		} catch (ArithmeticException e) {
			System.out.println("Erreur : Division par zéro.");
		} catch (InputMismatchException e) {
			System.out.println("Erreur : Entrée invalide.");	
		} finally {
			kInput.close();			
		}
	}

}