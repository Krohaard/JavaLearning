package TP6;

import java.util.Scanner;

public class TP6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kRandomList;
		int kSizeArray;
		int kUbound;
		int kLbound;
		Scanner kRead;
		
		kRead = new Scanner(System.in);
		System.out.printf("Taille du tableau : ");
		kSizeArray = kRead.nextInt();
		if(kSizeArray>0) {
			kRandomList = new int[kSizeArray];
			System.out.printf("Borne inférieur : ");
			kLbound = kRead.nextInt();
			System.out.printf("Borne supérieur : ");
			kUbound = kRead.nextInt();
			if(kUbound>kLbound && kUbound>0 && kLbound>0) {
				
			}else {
				System.out.println("Erreur dans les bornes du tableau");
			}
		}else {
			System.out.println("Erreur dans la taille du tableau");
		}
		kRead.close();
	}
	public static int kRardomNumber(int kMax, int kMin) {
		return kMin + random.nextInt(kMax - kMin + 1);
	}

}
