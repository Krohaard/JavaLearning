/**
 * 
 */
package krohaard;

import java.util.HashMap;
import java.util.Scanner;



public class KFunc {
	private HashMap<String, Integer> DataType;
	private void kInitDataType() {
		this.DataType.put("string", 1);
		this.DataType.put("double", 2);
		this.DataType.put("float", 3);
		this.DataType.put("long", 4);
		this.DataType.put("integer", 5);
		this.DataType.put("short", 6);
		this.DataType.put("byte", 7);
		this.DataType.put("boolean", 8);
	}
	public static void kQuestion(String kQuestion) {
		System.out.printf(kQuestion);
	}
	public static Object kQuestion(Scanner kRead, String kQuestion) {
		KIdentifierScanner kTemp = new KIdentifierScanner();
		kQuestion(kQuestion);
		kTemp.setValue(kRead);
		return kTemp.getValue();
	}
	public static boolean kCheckTypeAnswer(String kDataType, Object kValue) {
		if(kValue.getClass().getSimpleName().compareToIgnoreCase(kDataType)==0) {
			return true;
		}
		return false;
	}
	public static Object kQuestion(Scanner kRead, String kQuestion, String kOutput) {
		Object kTemp;
		kTemp = kQuestion(kRead,kQuestion);
		while(!kCheckTypeAnswer(kOutput,kTemp)) {
			System.out.println("Erreur de saisie.");
			kTemp = kQuestion(kRead,kQuestion);
		}
		return kTemp;
	}
}
