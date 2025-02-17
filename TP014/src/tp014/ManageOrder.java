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
	private Catalog kProducts;
	ManageOrder(Catalog ShowProducts){
		this.kShoppingCarts = new ArrayList<>();
		this.kProducts = ShowProducts;
	}
	private void ShowOrders() {
		if(!kCheckEmptyOrders()) {
			for(Order kElement : this.kShoppingCarts) {
				System.out.printf(" - Commande #%d :(%s)\n", kElement.getID(),kElement.getStatus());
				kElement.getShoppingCart().forEach((kProduct, kQty) -> {
					System.out.printf("\t%d x %s\n",kQty, kProduct.getName());
				});
			}
		}
	}
	private int kGenerateID() {
		return this.kShoppingCarts.stream().mapToInt(Order::getID).max().orElse(0)+1;
	}
	private boolean kCheckOrderID(int kId) {
		if(!kCheckEmptyOrders()) {
			if(this.kShoppingCarts.stream().filter(kElement -> kElement.getID() == kId).count()>0) return true;
			System.out.printf("La commande avec l'id: %d, n'existe pas\n",kId);
		}
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
		int kIdProduct;
		int kQtyProduct;
		int kIdOrder;
		int kk;
		kChooseMenu=0;
		while( kChooseMenu != 5 ) {
			kChooseMenu = (Integer) KFunc.kQuestion(kInput, displaymainmenu(),"integer");
			if(kChooseMenu>0 && kChooseMenu<6) {
				switch (kChooseMenu) {
					case 1: //add product to an order
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						if(!kCheckEmptyOrders() && !this.kProducts.kCheckEmptyProducts()) {
							kIdOrder = (int) KFunc.kQuestion(kInput,"Entrez l'ID de la commande :","integer");
							if(kCheckOrderID(kIdOrder)) {
								kIdProduct = (int) KFunc.kQuestion(kInput,"Entrez l'ID du produit à ajouter :","integer");
								if(this.kProducts.kCheckProductID(kIdProduct)) {
									kQtyProduct=(int) KFunc.kQuestion(kInput,"Entrez la quantité :","integer");
									for(kk=0;kk<this.kShoppingCarts.size();kk++) {
										if(this.kShoppingCarts.get(kk).getID()==kIdOrder)
											this.kShoppingCarts.get(kk).addProduct(this.kProducts.searchById(kIdProduct), kQtyProduct);
									}
								}
							}
						}						
						break;
					case 2:
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						Order test = new Order(kGenerateID());
						this.kShoppingCarts.add(test);
						System.out.printf("Nouvelle commande créée avec ID %d.\n",this.kShoppingCarts.getLast().getID());
						break;
					case 3: //show all order
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						this.ShowOrders();
						break;
					case 4: //update the status of order
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						break;
					case 5: //return main menu
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						System.out.println("Retour au menu principal.");
						break;
					default:
						break;
				}
			} else {
				System.out.println("Veuillez taper un chiffre entre 1 et 4.");
			}
		}
	}
	private String displaymainmenu() {
		String kMenu;
		kMenu = new String();
		kMenu = "\n---- MENU ----\n";
		kMenu = kMenu + "1. Ajouter un produit à une commande\n";
		kMenu = kMenu + "2. Créer une commande\n";
		kMenu = kMenu + "3. Afficher toutes les commandes\n";
		kMenu = kMenu + "4. Modifier le statut d'une commande\n";
		kMenu = kMenu + "5. Retour\n";
		return kMenu;
	}
}
