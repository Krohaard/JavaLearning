/**
 * 
 */
package tp006;

/**
 * 
 */
public class Car extends Automotive {
	private int kNumberDoors;
	Car(String oBrend, String oModel, int kDoors) {
		super(oBrend, oModel);
		this.kNumberDoors = kDoors;
	}
	public void setDoors(int kDoors) {
		this.kNumberDoors = kDoors;
	}
	public int getDoors() {
		return this.kNumberDoors;
	}
	@Override
	public void displayCharacteristics() {
		super.displayCharacteristics();
		System.out.printf("\t- Votre voiture à: %d portes\n",this.kNumberDoors);
	}
}
