/**
 * 
 */
package tp009;

/**
 * 
 */
public class Rectangle {
	private float kWidth;
	private float kLenght;

	//Constructeur
	public Rectangle() {
	}

	public void setWidth(float width) {
		this.kWidth = width;
	}
	public float getWidth() {
		return kWidth;
	}
	public void setLenght(float lenght) {
		this.kLenght = lenght;
	}
	public float getLenght() {
		return kLenght;
	}
	public float calculateArea() {
		return kWidth * kLenght;
	}
	public float calculatePerimeter() {
		return (kWidth + kLenght) * 2;
	}
	public void checkDimension() {
		if(kWidth < 0 || kLenght < 0)
			throw new ArithmeticException("Erreur : Les dimensions doivent être positives.");
	}
}
