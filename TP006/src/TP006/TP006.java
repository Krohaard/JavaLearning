package TP006;

import java.util.Random;
import java.util.Scanner;

public class TP006 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kRandomList;
		int kSizeArray;
		int kUbound;
		int kLbound;
		int kk=0;
		Random kRandom;
		Scanner kRead;
		
		kRead = new Scanner(System.in);
		kRandom = new Random();
		System.out.printf("Taille du tableau : ");
		kSizeArray = kRead.nextInt();
		if(kSizeArray>0) {
			kRandomList = new int[kSizeArray];
			System.out.printf("Borne inférieur : ");
			kLbound = kRead.nextInt();
			System.out.printf("Borne supérieur : ");
			kUbound = kRead.nextInt();
			if(kUbound>kLbound) {
				for(kk=0;kk<kSizeArray;kk++) {
					kRandomList[kk]=kLbound + kRandom.nextInt(kUbound - kLbound + 1);
				}
				System.out.println("Tableau généré : " + kFormatArray(kRandomList));
				System.out.println("Somme : " + kSumArray(kRandomList));
				System.out.println("Moxenne : " + kMeanArray(kRandomList));
				System.out.println("Plus petit : " + kMinMaxArray(kRandomList)[0]);
				System.out.println("Plus grand : " + kMinMaxArray(kRandomList)[1]);
			}else {
				System.out.println("Erreur dans les bornes du tableau");
			}
		}else {
			System.out.println("Erreur dans la taille du tableau");
		}
		kRead.close();
	}
	public static String kFormatArray(int[] kData) {
		int kk;
		String kOut;
//		kOut = new String();
		kOut="[ "+kData[0];
		for(kk=1;kk<kData.length;kk++) {
			kOut+=", "+kData[kk];
		}
		kOut+=" ]";
		return kOut;
	}
	public static int kSumArray(int[] kData) {
		int kSum=0;
		int kk;
		for(kk=0;kk<kData.length;kk++) {
			kSum+=kData[kk];
		}
		return kSum;
	}
	public static float kMeanArray(int[] kData) {
		return (float) kSumArray(kData)/kData.length;
	}
	public static int[] kMinMaxArray(int[] kData) {
	    int kMin = kData[0];
	    int kMax = kData[0];
	    for (int kk = 1; kk < kData.length; kk++) {
	        if (kData[kk] < kMin) kMin = kData[kk];
	        if (kData[kk] > kMax) kMax = kData[kk];
	    }
	    return new int[] {kMin, kMax};
	}
}
