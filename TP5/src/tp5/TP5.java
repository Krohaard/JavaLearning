package tp5;

import java.util.ArrayList;
import java.util.Scanner;

public class TP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kk;
		Scanner kRead = new Scanner(System.in);
		System.out.printf("Entrez un nombre positif :");
		kk = kRead.nextInt();
		if(kCheckPerfectNumber(kk) && kk > 0) {
			System.out.printf("%d est un nombre parfait\n",kk);
			System.out.println("Diviseurs propres :" + kSearchDivider(kk));
		}else {
			if(!kCheckPerfectNumber(kk)) {
				System.out.printf("%d n'est pas un nombre parfait\n",kk);
			}else {
				System.out.println("Erreur de saisie\n");
			}
		}
	}
	public static ArrayList<Integer> kSearchDivider(float kValue) {
		int kMaxDivider;
		int kk;
		ArrayList<Integer> kResultTemp = new ArrayList<>();
		kMaxDivider = (int) (kValue / 2);
		for(kk=1;kk<=kMaxDivider;kk++) {
			if(((kValue/kk) - ((int) (kValue/kk)))==0) {
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
		if(kSumArray(kSearchDivider(kValue))==kValue) return true;
		return false;
	}
}
