package tp7;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileReader;

public class TP7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kArraySelected;
		String kQuestion;
		String[] kArrayData;
		Scanner kRead;
		File kFile;
		String kNameFile;
		boolean kErrorKey;

		kQuestion = "Y"; //Default value
		kErrorKey = false; // Default value
		kRead = new Scanner(System.in);
		System.out.printf("Entrez un nombre pour la table de multiplication :");
		kArraySelected = kRead.nextInt();
		kRead.nextLine(); //consumption of the enter key with the last input

		kArrayData = kArrayCreation(kArraySelected);
		kNameFile="Table" + kArraySelected + ".txt";

		kFile = new File(kNameFile);
		if(kFile.exists()) {
			do {
				System.out.printf("Voulez-vous écraser le fichier? [Y]/n");
				kQuestion = kRead.nextLine().trim();;
				if(kQuestion.isEmpty()) {
					kQuestion= "Y";
				}
				kErrorKey=!kQuestion.equalsIgnoreCase("Y") && !kQuestion.equalsIgnoreCase("n");
				if(kErrorKey) System.out.println("Saisie invalide!");
			}while(kErrorKey);
		}
		if(kQuestion.equalsIgnoreCase("Y")) {
			try {
				kWriteDataFile(kArrayData,kNameFile);
				System.out.println("Fichier \"" + kNameFile + "\" créé et rempli.");
				System.out.println("Contenu du fichier :");
				System.out.println("--------------------");
				kReadDataFile(kNameFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Erreur lors de la manipulation du fichier : " + e.getMessage());
			}
//			kDisplayResult(kArrayData);
		}else {
			System.out.println("Opération annulée.");
		}
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

	public static void kWriteDataFile(String[] kData, String kNameFile) throws IOException {
		int kk;
		FileWriter kFile;
		kFile = new FileWriter(kNameFile);
		for(kk=0;kk<kData.length;kk++) {
			kFile.write(kData[kk] + "\r\n");
		}
		kFile.close();
	}

	public static void kReadDataFile(String kNameFile) throws IOException {
		Scanner kReaderFile;
		File kFile;
		kFile = new File(kNameFile);
		kReaderFile = new Scanner(kFile,StandardCharsets.UTF_8);
        while (kReaderFile.hasNextLine()) {
            System.out.println(kReaderFile.nextLine());
        }
        kReaderFile.close();
		//kFile.close();
	}
}