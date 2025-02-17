/**
 * 
 */
package tp014;

import java.util.Scanner;

import krohaard.KFunc;

/**
 * 
 */
public class TP014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int kChooseMenu;
		Scanner kRead;
		Catalog Magasin;
		ManageOrder ShoppingCarts;

		
		kChooseMenu=0;
		kRead = new Scanner(System.in);
		Magasin = new Catalog();
		ShoppingCarts = new ManageOrder(Magasin);
		while( kChooseMenu != 3 ) {
			kChooseMenu = (Integer) (KFunc.kQuestion(kRead, displaymenu(),"integer"));
			if(kChooseMenu>0 && kChooseMenu<4) {
				switch (kChooseMenu) {
					case 1: //product menu
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						Magasin.catalogmenu(kRead);
						break;
					case 2: //search product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						ShoppingCarts.ordermenu(kRead);
						break;
					case 3: //exit program
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						System.out.println("Au revoir!!!");
						break;
					default:
						break;
				}
			} else {
				System.out.println("Veuillez taper un chiffre entre 1 et 3.");
			}
		}
		kRead.close();
	}
	private static String displaymenu() {
		String kMenu;
		kMenu = new String();
		kMenu = "\n---- MENU ----\n";
		kMenu = kMenu + "1. Menu Catalogue (ajouter, supprimer, ...)\n";
		kMenu = kMenu + "2. Menu Commande (ajouter, supprimer, ...)\n";
		kMenu = kMenu + "3. Quitter\n";
		return kMenu;
	}
}