/**
 * 
 */
package krohaard;

import java.util.Scanner;


public class KIdentifierScanner {
	private Object kValue;

	private String Identifier(Scanner kInput) {
		String kIdentifier;
		kIdentifier = new String();
		if (kInput.hasNextInt()) {
			kIdentifier = "integer";
		} else if (kInput.hasNextDouble()) {
			kIdentifier = "double";
		} else if (kInput.hasNextBoolean()) {
			kIdentifier = "boolean";
		} else if (kInput.hasNextLine()) {
			kIdentifier = "string";
		} else if (kInput.hasNextByte()) {
			kIdentifier = "byte";
		} else if (kInput.hasNextFloat()) {
			kIdentifier = "float";
		} else if (kInput.hasNextLong()) {
			kIdentifier = "long";
		} else if (kInput.hasNextShort()) {
			kIdentifier = "short";
		}
		return kIdentifier;
	}
	public void setValue(Scanner kInput) {
		String kTemp;
		kTemp = Identifier(kInput);
		switch (kTemp) {
			case "integer":
				this.kValue = Integer.valueOf(kInput.nextInt());
				break;
			case "double":
				this.kValue = Double.valueOf(kInput.nextDouble());
				break;
			case "boolean":
				this.kValue = Boolean.valueOf(kInput.nextBoolean());
				break;
			case "string":
				this.kValue = kInput.nextLine();
				break;
			case "byte":
				this.kValue = Byte.valueOf(kInput.nextByte());
				break;
			case "float":
				this.kValue = Float.valueOf(kInput.nextFloat());
				break;
			case "long":
				this.kValue = Long.valueOf(kInput.nextLong());
				break;
			case "short":
				this.kValue = Short.valueOf(kInput.nextShort());
				break;
			default:
				break;
		}
		if(kTemp.compareToIgnoreCase("string")!=0) kInput.nextLine();
	}
	public Object getValue() {
		return kValue;
	}
    
}
