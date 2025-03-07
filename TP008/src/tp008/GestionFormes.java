/**
 * 
 */
package tp008;

import java.util.ArrayList;

/**
 * 
 */
public class GestionFormes {
	private ArrayList<Forme> kListForm;

	GestionFormes(){
		this.kListForm = new ArrayList<>();
	}
	public void AddForm(Forme oForme) {
		this.kListForm.add(oForme);
	}
	public void DrawForm() {
		for(Forme kElement : kListForm) {
			kElement.dessiner();
		}
	}
	public ArrayList<Double> SurfaceCalculation() {
		ArrayList<Double> kSurface;
		kSurface = new ArrayList<>();
		for(Forme kElement : kListForm) {
			kSurface.add(kElement.calculerAire());
		}
		return kSurface;
	}
	
}
