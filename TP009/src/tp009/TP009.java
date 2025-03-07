/**
 * 
 */
package tp009;

import java.util.ArrayList;

/**
 * 
 */
public class TP009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kNumberRandom;
		int kTotNumber;
		int kk;
		ArrayList<Integer> kListNumber;
		kListNumber = new ArrayList<>();
		kTotNumber = (int) (Math.random()*1000);
		for(kk=0;kk<kTotNumber;kk++) {
			kNumberRandom = (int) (Math.random()*Math.random()*43);
			kListNumber.add(kNumberRandom);
		}
		System.out.println(kListNumber);
		System.out.println((double) kListNumber.stream().mapToDouble(Integer::intValue).sum()/kListNumber.size());
	}

}
