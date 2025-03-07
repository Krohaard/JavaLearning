/**
 * 
 */
package tp008;

/**
 * 
 */
public class Cercle implements Forme {
	private double kRayon;

	public Cercle(double oRayon) {
		this.kRayon = oRayon;
	}

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub
		return Math.PI*2*kRayon;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return Math.PI*kRayon;
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		System.out.printf("Je dessine un %s qui fait une superficie de %.2fmm², et un périmètre de %.2fmm\n",this.getClass().toString().split("[.]")[1], this.calculerAire(),this.calculerPerimetre());
	}

}
