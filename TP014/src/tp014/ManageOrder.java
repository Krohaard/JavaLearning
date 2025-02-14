/**
 * 
 */
package tp014;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import krohaard.KFunc;

/**
 * 
 */
public class ManageOrder {
	private ArrayList<Order> kShoppingCarts;
	private HashMap<Product,Integer> kShoppingCart;
	ManageOrder(){
		this.kShoppingCarts = new ArrayList<>();
	}
	private void ShowOrders() {
		if(!kCheckEmptyOrders()) {
			for(Order kElement : this.kShoppingCarts) {
				System.out.printf(" - [%d] %s\n", kElement.getID(),kElement.getStatus());
			}
		}
	}
	private int kGenerateID() {
		return this.kShoppingCarts.stream().mapToInt(Order::getID).max().orElse(0)+1;
	}
	private boolean kCheckOrderID(int kId) {
		if(this.kShoppingCarts.stream().filter(kElement -> kElement.getID() == kId).count()>0) return true;
		System.out.printf("La commande avec l'id: %d, n'existe pas\n",kId);
		return false;
	}
	private boolean kCheckEmptyOrders() {
		if(this.kShoppingCarts.isEmpty()) {
			System.out.println("Il n'y a aucune commande en cours.");
			return true;
		}
		return false;
	}
	public void ordermenu(Scanner kInput) {
		Integer kChooseMenu;
		kChooseMenu=0;
		while( kChooseMenu != 5 ) {
			kChooseMenu = (Integer) KFunc.kQuestion(kInput, displaymenu(),"integer");
			if(kChooseMenu>0 && kChooseMenu<6) {
				switch (kChooseMenu) {
					case 1: //add product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						break;
					case 2: //search product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						break;
					case 3: //show all products
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						this.ShowOrders();
						break;
					case 4: //update the quantity of one product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						break;
					case 5: //exit program
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						System.out.println("Retour au menu principal.");
						break;
					default:
						break;
				}
			} else {
				System.out.println("Veuillez taper un chiffre entre 1 et 5.");
			}
		}
	}
	private String displaymenu() {
		String kMenu;
		kMenu = new String();
		kMenu = "\n---- MENU ----\n";
		kMenu = kMenu + "1. Créer une commande\n";
		kMenu = kMenu + "2. Ajouter un produit à une commande\n";
		kMenu = kMenu + "3. Afficher toutes les commandes\n";
		kMenu = kMenu + "4. Modifier le statut d'une commande\n";
		kMenu = kMenu + "5. Retour\n";
		return kMenu;
	}
}
