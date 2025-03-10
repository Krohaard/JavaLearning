/**
 * 
 */
package tp011_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

/**
 * 
 */
public class TP011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random kRandom;
		char kLetter;
		int kk;
		int ll;
		int kEnd;
		int kLenght;
		int kSpace;
		String kText;
		StringBuilder kFile;
		
		kText = new String();
		kRandom = new Random();
		kFile = new StringBuilder();
		kLenght = kRandom.nextInt(101)+19;
		kSpace = kRandom.nextInt(12)+6;
		kLetter = 0;
		for(ll=0;ll<kLenght;ll++) {
			kEnd = kRandom.nextInt(101)+49;
			for(kk=0;kk<kEnd;kk++) {
				while((kLetter<65 || kLetter>90) && (kLetter>122 || kLetter<97)) {
					kLetter = (char) (kRandom.nextInt(122-65)+65);
				}
				if(Math.ceilMod(kk, kSpace)==0) {
					kText = kText + ' ';
					kSpace = kRandom.nextInt(12)+6;
					kk=kk+1;
				}
				kText = kText + kLetter;
				kLetter = 0;
			}
			kText = kText + "\n";
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("fichier.txt"))){
			bw.write(kText);
		} catch(IOException e) {
			System.out.println(e);
		}
		//read the file txt
		try {
			kFile.append(new String(Files.readAllBytes(Paths.get("fichier.txt"))));
		} catch (IOException e) {
			System.out.println("Erreur de lecture du fichier : " + e.getMessage());
		}
		//copy the input file to the output file
		try {
			Files.write(Paths.get("fichierCopy.txt"), kFile.toString().getBytes());
		} catch (IOException e) {
			System.out.println("Erreur de lecture du fichier : " + e.getMessage());
		}
//other method
		kFile.setLength(0);
		kLenght = kRandom.nextInt(101)+19;
		for(ll=0;ll<kLenght;ll++) {
			kEnd = kRandom.nextInt(101)+49;
			for(kk=0;kk<kEnd;kk++) {
				kLetter = (char) (kRandom.nextInt(91+26+5-65)+65);
				kFile.append(kLetter);
			}
			kFile.append("\n");
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("fichier2.txt"))){
			bw.write(kFile.toString());
		} catch(IOException e) {
			System.out.println(e);
		}
		kText = "";
		try(BufferedReader kReader = new BufferedReader(new FileReader("fichier2.txt"));
				BufferedWriter kWrite = new BufferedWriter(new FileWriter("Copyfichier2.txt"))){
			while((kText = kReader.readLine()) != null) {
				kWrite.write(kText);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
