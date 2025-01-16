/**
 * 
 */
package tp010;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */
public class TP010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> kRandList;
		kRandList= kRandomList(10);
		System.out.println("Liste originale : " + kRandList);
		System.out.println("Plus grand : " + kMaxList(kRandList));
		System.out.println("Plus petit : " + kMinList(kRandList));
	}
	public static ArrayList<Integer> kRandomList(int kNumber){
		int kMin;
		int kMax;
		int kk;
		ArrayList<Integer> kList;
		Random kRandom;

		kMin =1;
		kMax = 100;
		kList = new ArrayList<>();
		kRandom = new Random();
		for(kk=0;kk<kNumber;kk++) {
			kList.add(kMin + kRandom.nextInt(kMax - kMin + 1));
		}
		return kList;
	}
	public static int kMinList(ArrayList<Integer> kData) {
		int kMin = kData.getFirst();
		for(Integer kElement : kData) {
			if(kElement <= kMin) kMin = kElement;
		}
		return kMin;
	}
	public static int kMaxList(ArrayList<Integer> kData) {
		int kMax = kData.getFirst();
		for(Integer kElement : kData) {
			if(kElement >= kMax) kMax = kElement;
		}
		return kMax;
	}

}
