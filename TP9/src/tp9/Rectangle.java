/**
 * 
 */
package tp9;

/**
 * 
 */
public class Rectangle {
	private float kWeight;
	private float kLenght;

	//Constructeur
	public Rectangle() {
	}

	public void setkWeight(float weight) {
		this.kWeight = weight;
	}
	public float getWeight() {
		return kWeight;
	}
	public void setkLenght(float lenght) {
		this.kLenght = lenght;
	}
	public float getLenght() {
		return kLenght;
	}
	public float kSurfaceRectangle() {
		return kWeight * kLenght;
	}
	public float kPerimetreRectangle() {
		return (kWeight + kLenght) * 2;
	}
}
