/**
 * 
 */
package tp008;

/**
 * 
 */
public class Triangle implements Forme{
	private double kCote1;
	private double kCote2;
	private double kCote3;

	public Triangle(double oCote1, double oCote2, double oCote3) {
		// TODO Auto-generated constructor stub
		this.kCote1 = oCote1;
		this.kCote2 = oCote2;
		this.kCote3 = oCote3;
	}

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub
		return Math.sqrt((kCote1+kCote2+kCote3)/2*((kCote1+kCote2+kCote3)/2-kCote1)*((kCote1+kCote2+kCote3)/2-kCote2)*((kCote1+kCote2+kCote3)/2-kCote3));
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return kCote1 + kCote2 + kCote3;
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		System.out.printf("Je dessine un %s qui fait une superficie de %.2fmm², et un périmètre de %.2fmm\n",this.getClass().toString().split("[.]")[1], this.calculerAire(),this.calculerPerimetre());
	}

}
