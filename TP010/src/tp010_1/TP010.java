/**
 * 
 */
package tp010_1;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		Random kRandom;
		char kLetter;
		int kk;
		int ll;
		String kText;
		kText = new String();
		kRandom = new Random();
		for(ll=0;ll<15;ll++) {
			for(kk=0;kk<49;kk++) {
				kLetter = (char) (kRandom.nextInt(91+26+5-65)+65);
				kText = kText + kLetter;
			}
			kText = kText + "\n";
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("fichier.txt"))){
			bw.write(kText);
		} catch(IOException e) {
			System.out.println(e);
		}

		try(FileReader reader = new FileReader("fichier.txt")){
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
