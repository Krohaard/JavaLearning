/**
 * 
 */
package krohaard;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */
public class KFunc {
	public static void kQuestion(String kQuestion) {
		System.out.printf(kQuestion);
	}
	public static Object kQuestion(Scanner kRead, String kQuestion) {
		kQuestion(kQuestion);
		return kIdentifierScanner(kRead);
	}
	public static Object kQuestion(Scanner kRead, String kQuestion, String kOutput) {
		Object kTemp;
		kTemp = kQuestion(kRead,kQuestion);
		kTemp = kYesNoQuestion(kTemp,kQuestion,kOutput);
		while(!kCheckConvertType(kOutput,kTemp)) {
			System.out.println("Erreur de saisie.");
			kTemp = kQuestion(kRead,kQuestion);
			kTemp = kYesNoQuestion(kTemp,kQuestion,kOutput);
		}
		if(!kCheckTypeAnswer(kOutput,kTemp))
			kTemp = kConvertType(kTemp,kOutput);
		return kTemp;
	}
	private static Object kConvertType(Object kDataInput, String kTypeOutput) {
		String kString;
		kString = new String();
		kString = kDataInput.toString();
		switch(kTypeOutput) {
			case "string":
				kDataInput = kString;
				break;
			case "short":
				kDataInput = Short.valueOf(kString);
				break;
			case "long":
				kDataInput = Long.valueOf(kString);
				break;
			case "integer":
				kDataInput = Integer.valueOf(kString);
				break;
			case "double":
				kDataInput = Double.valueOf(kString);
				break;
			case "float":
				kDataInput = Float.valueOf(kString);
				break;
		}
		kString = null;
		return kDataInput;
	}
	private static boolean kCheckTypeAnswer(String kDataType, Object kValue) {
		if(kValue.getClass().getSimpleName().compareToIgnoreCase(kDataType)==0) {
			return true;
		}
		return false;
	}
	private static boolean kCheckConvertType(String kDataType, Object kValue) {
		boolean kStatus;
		HashMap<String,Integer> kTypeList;

		kStatus = false;
		kTypeList = new HashMap<>();
		kTypeList.put("string",0);
		kTypeList.put("boolean",1);
		kTypeList.put("double",2);
		kTypeList.put("float",3);
		kTypeList.put("integer",4);
		kTypeList.put("long",5);
		kTypeList.put("short",6);
		kTypeList.put("byte",7);
		
		if(kTypeList.get(kValue.getClass().getSimpleName().toLowerCase())>=kTypeList.get(kDataType)) {
			kStatus = true;
		}
		kTypeList.clear();
		kTypeList = null;
		return kStatus;
	}
	private static Object kIdentifierScanner(Scanner kTemp) {
		Object kIdentifier;
		Scanner kInput;
		kIdentifier = new String();
		kInput = new Scanner(kTemp.nextLine());
		if (kInput.hasNextByte()) {
			kIdentifier = kInput.nextByte();
		} else if (kInput.hasNextShort()) {
			kIdentifier = kInput.nextShort();
		} else if (kInput.hasNextInt()) {
			kIdentifier = kInput.hasNextInt();
		} else if (kInput.hasNextLong()) {
			kIdentifier = kInput.nextLong();
		} else if (kInput.hasNextFloat()) {
			kIdentifier = kInput.nextFloat();
		} else if (kInput.hasNextDouble()) {
			kIdentifier = kInput.nextDouble();
		} else if (kInput.hasNextBoolean()) {
			kIdentifier = kInput.hasNextBoolean();
		} else if (kInput.hasNextLine()) {
			kIdentifier = kInput.nextLine();
		}
		kInput.close();
		return kIdentifier;
	}
	private static Object kYesNoQuestion(Object kInput,String kLine,String kTypeExpected) {
		String kRegex = "\\[*\\(*[YyOoNn]\\)*\\]*/\\[*\\(*[NnYyOo]\\)*\\]*";
		Pattern kPattern = Pattern.compile(kRegex);
		Matcher kMatcher = kPattern.matcher(kLine);
		if(kTypeExpected.equalsIgnoreCase("boolean")) {
			if(kMatcher.find()) {
				kRegex = "[\\(\\[](.)[\\)\\]]";
				kPattern = Pattern.compile(kRegex);
				kMatcher = kPattern.matcher(kLine);
				if(kMatcher.find()) {
					if(kInput.toString().isBlank() || kInput.toString().isEmpty()) kInput = kMatcher.group(1);
					switch(kInput.toString().toLowerCase()) {
						case "y":
						case "o":
							kInput = true;
							break;
						case "n":
							kInput = false;
							break;
					}
				}
			}
		}
		return kInput;
	}
/*
		if(kOutput.equalsIgnoreCase("boolean")) {
			if(kYesNoQuestion(kQuestion))
				if(kCheckYesNoDefault(kQuestion))
					switch(kDefaultYesNoQuestion(kQuestion)) {
						case 'y':
						case 'o':
							kEmptyDefault=true;
							break;
						case 'n':
							kEmptyDefault=false;
							break;
					}
		}

 */
	private static char kDefaultYesNoQuestion(String kLine) {
		String kRegex = "[\\(\\[](.)[\\)\\]]";
		Pattern kPattern = Pattern.compile(kRegex);
		Matcher kMatcher = kPattern.matcher(kLine);
		kRegex = null;
		kMatcher.find();
		return kMatcher.group(1).toLowerCase().charAt(0);
	}
}
