/**
 * 
 */
package tp006;

import java.util.Scanner;

import krohaard.KFunc;

/**
 * 
 */
public class TP006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automotive kVehicule;
		Car kCar;
		Scanner kRead;
		String kBrand;
		String kModel;
		int kDoors;
		kRead = new Scanner(System.in);
		kBrand = (String) KFunc.kQuestion(kRead,"Veuillez taper la marque du véhicule : ","string");
		kModel = (String) KFunc.kQuestion(kRead,"Veuillez taper le model du véhicule : ","string");
		kVehicule = new Automotive(kBrand,kModel);
		kBrand = (String) KFunc.kQuestion(kRead,"Veuillez taper la marque du véhicule : ","string");
		kModel = (String) KFunc.kQuestion(kRead,"Veuillez taper le model du véhicule : ","string");
		kDoors = (int) KFunc.kQuestion(kRead,"Veuillez taper le model du véhicule : ","integer");
		kCar = new Car(kBrand,kModel,kDoors);
		kRead.close();
		kVehicule.displayCharacteristics();
		kCar.displayCharacteristics();
	}

}
