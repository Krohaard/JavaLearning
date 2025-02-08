/**
 * 
 */
package tp013;

import java.util.Scanner;

import krohaard.KFunc;


/**
 * 
 */
public class TP013 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer kChooseMenu;
		Scanner kRead;
		Catalog kMagazin;
		
		kChooseMenu=0;
		kMagazin = new Catalog();
		kRead = new Scanner(System.in);
		while( kChooseMenu != 6 ) {
			kChooseMenu = (Integer) KFunc.kQuestion(kRead, displaymenu(),"integer");
			if(kChooseMenu>0 && kChooseMenu<7) {
				switch (kChooseMenu) {
					case 1: //add product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						kMagazin.AddProduct(kRead);
						break;
					case 2: //search product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						break;
					case 3: //show all products
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						kMagazin.ShowProducts();
						break;
					case 4: //update the quantity of one product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						kMagazin.UpdateQty(kRead);
						break;
					case 5: //delete a product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						kMagazin.DeletProduct(kRead);
						break;
					case 6: //exit program
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						System.out.println("Au revoir!!!");
						break;
					default:
						break;
				}
			} else {
				System.out.println("Veuillez taper un chiffre entre 1 et 6.");
			}
		}
		kRead.close();
	}
	private static String displaymenu() {
		String kMenu;
		kMenu = new String();
		kMenu = "\n---- MENU ----\n";
		kMenu = kMenu + "1. Ajouter un produit\n";
		kMenu = kMenu + "2. Rechercher un produit\n";
		kMenu = kMenu + "3. Afficher tous les produits\n";
		kMenu = kMenu + "4. Mettre à jour la quantité d'un produit\n";
		kMenu = kMenu + "5. Supprimer un produit\n";
		kMenu = kMenu + "6. Quitter\n";
		return kMenu;
	}
}
