package tp7;

import java.util.Scanner;

public class TP7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kArraySelected;
		String[] kArrayData;
		Scanner kRead;
		kRead = new Scanner(System.in);
		System.out.printf("Entrez un nombre pour la table de multiplication :");
		kArraySelected = kRead.nextInt();
		kArrayData = kArrayCreation(kArraySelected);
		kDisplayResult(kArrayData);
		kRead.close();
	}
	public static String[] kArrayCreation(int kNum) {
		String[] kDataOut;
		int kk;
		kDataOut = new String[10];
		for(kk=1;kk<=10;kk++) {
			kDataOut[kk-1] = kNum + " x " + kk + " = " + (kNum * kk);
		}
		return kDataOut;
	}
	public static void kDisplayResult(String[] kData) {
		int kk;
		for(kk=0;kk<kData.length;kk++) {
			System.out.println(kData[kk]);
		}
	}
}