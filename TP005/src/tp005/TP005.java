package tp005;

import java.util.ArrayList;
import java.util.Scanner;

public class TP005 {

	public static void main(String[] args) {
		int kk;
		Scanner kRead = new Scanner(System.in);
		System.out.printf("Entrez un nombre positif :");
		kk = kRead.nextInt();
		if(kk <= 0) {
			System.out.println("Erreur de saisie\n");
		}else {
			if(kCheckPerfectNumber(kk)) {
				System.out.printf("%d est un nombre parfait\n",kk);
				System.out.println("Diviseurs propres :" + kSearchDivider(kk));
			}else {
				System.out.printf("%d n'est pas un nombre parfait\n",kk);
			}
		}
		kRead.close();
	}
	public static ArrayList<Integer> kSearchDivider(int kValue) {
		int kMaxDivider;
		int kk;
		ArrayList<Integer> kResultTemp = new ArrayList<>();
		kMaxDivider = kValue / 2;
		for(kk=1;kk<=kMaxDivider;kk++) {
			if( kValue % kk == 0) {
				kResultTemp.add(kk);
			}
		}
		return kResultTemp;
	}
	public static int kSumArray(ArrayList<Integer> kData) {
		int kSum=0;
		for(int kElement : kData) {
			kSum = kSum + kElement;
		}
		return kSum;
	}
	public static boolean kCheckPerfectNumber(int kValue) {
		return kSumArray(kSearchDivider(kValue)) == kValue;
	}
}
