/**
 * 
 */
package tp010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
		kRandList = kRandomList(10);
		try {
			System.out.println("Liste originale : " + kRandList);
			System.out.println("Plus grand : " + kMaxList(kRandList));
			System.out.println("Plus petit : " + kMinList(kRandList));
			System.out.println("Somme : " + kSumList(kRandList));
			System.out.println("Moyenne : " + kMeanList(kRandList));
			System.out.println("Liste après suppression des nombres pairs : " + kRemoverEven(kRandList.iterator()));
		} catch(Exception e) {
			
		}
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
		if (kData.isEmpty()) {
		    throw new IllegalArgumentException("La liste est vide.");
		}
		return Collections.min(kData);
	}
	public static int kMaxList(ArrayList<Integer> kData) {
		if (kData.isEmpty()) {
		    throw new IllegalArgumentException("La liste est vide.");
		}
		return Collections.max(kData);
	}
	public static int kSumList(ArrayList<Integer> kData) {
		int kSum=0;
		if (kData.isEmpty()) {
		    throw new IllegalArgumentException("La liste est vide.");
		}
		for(Integer kElement : kData) {
			kSum += kElement;
		}
		return kSum;
	}
	public static float kMeanList(ArrayList<Integer> kData) {
		return (float) kSumList(kData)/kData.size();
	}
	public static Iterator<Integer> kRemoverEven(Iterator<Integer> kData){
		while (kData.hasNext()) {
		    if (kData.next() % 2 == 0) {
		    	kData.remove();
		    }
		}
		return kData;
	}
}
