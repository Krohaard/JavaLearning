/**
 * 
 */
package tp009_2;

import java.util.HashMap;
import java.util.Random;

/**
 * 
 */
public class TP009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kName;
		Double kNote;
		Double kMean;
		HashMap<String,Double> kListStudent;
		Random kRandom;
		char kLetter;
		int kk;
		int ll;
		int kMaxStudent;
		
		kName = new String();
		kName = "";
		kRandom = new Random();
		kListStudent = new HashMap<>();
		kMaxStudent = kRandom.nextInt(50)+1;
		for(ll=0;ll<kMaxStudent;ll++) {
			for(kk=0;kk<9;kk++) {
				kLetter = (char) (kRandom.nextInt(91-65)+65);
				kName = kName + kLetter;
			}
			kNote = kRandom.nextDouble(21);
			while(kNote == null) kNote = kRandom.nextDouble(21);
			kListStudent.put(kName, kNote);
			kName = "";
		}
		kMean = kListStudent.values().stream().mapToDouble(Double::doubleValue).sum()/kListStudent.size();
		System.out.println(kListStudent.values());
		System.out.println(kMean);
		kListStudent.forEach((kString,kDouble)-> {if(kDouble >= kMean) System.out.printf("%s : %.2f\n",kString,kDouble);});
	}

}
