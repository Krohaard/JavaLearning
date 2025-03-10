/**
 * 
 */
package tp011_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 */
public class TP011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder kFile;
		kFile = new StringBuilder();
		String[] kList;
		//read the file txt
		try {
			kFile.append(new String(Files.readAllBytes(Paths.get("fichier.txt"))));
		} catch (IOException e) {
			System.out.println("Erreur de lecture du fichier : " + e.getMessage());
		}
		kList = kFile.toString().split("\\s+");
		System.out.printf("il y a %d mots dans ce texte.\n",kList.length);
	}

}
