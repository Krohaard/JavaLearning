/**
 * 
 */
package tp008;

/**
 * 
 */
public class Rectangle implements Forme {
	private double kLongueur;
	private double kLargeur;

	public Rectangle(double oLength, double oWidth){
		this.kLargeur = oWidth;
		this.kLongueur = oLength;
	}
	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub
		return kLongueur*kLargeur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*(kLargeur+kLongueur);
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		System.out.printf("Je dessine un %s qui fait une superficie de %.2fmm², et un périmètre de %.2fmm\n",this.getClass().toString().split("[.]")[1], this.calculerAire(),this.calculerPerimetre());
	}

}
