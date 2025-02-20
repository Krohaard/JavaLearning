/**
 * 
 */
package tp006;

/**
 * 
 */
public class Automotive {
	private String kBrand;
	private String kModel;
	Automotive(String oBrend, String oModel){
		this.kBrand = oBrend;
		this.kModel = oModel;
	}
	public String getBrand() {
		return this.kBrand;
	}
	public String getModel() {
		return this.kModel;
	}
	public void displayCharacteristics() {
		System.out.println("votre véhicule a les caractéristiques suivantes : ");
		System.out.printf("\t- Marque: %s\n",this.kBrand);
		System.out.printf("\t- Model: %s\n",this.kModel);
	}
}
