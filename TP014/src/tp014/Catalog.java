/**
 * 
 */
package tp014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import krohaard.KFunc;

/**
 * 
 */
public class Catalog {
	private ArrayList<Product> kProducts;

	Catalog(){
		this.kProducts = new ArrayList<>();
	}
	private void AddProduct(Scanner kRead) {
		Product kProduct;
		Integer kQuantity;
		String kName;
		Double kPrice;

		kName = (String) KFunc.kQuestion(kRead, "Entrez le nom du produit :","string");
		if(kCheckProductExist(kName)) {
			KFunc.kQuestion(kRead,"Voulez-vous créer un doublon y/[N] :","boolean");
		}
		kPrice = (Double) KFunc.kQuestion(kRead, "Entrez le prix :","double");
		kQuantity = (Integer) KFunc.kQuestion(kRead, "Entrez le stock :","integer");

		kProduct = new Product(kGenerateID(),kName, kPrice, kQuantity);
		this.kProducts.add(kProduct);
	}
	private boolean kCheckProductExist(String oName) {
		if(!this.kProducts.isEmpty()) {
			List<Product> kFilter = this.kProducts.stream().filter(kElement -> kElement.getName().equalsIgnoreCase(oName)).collect(Collectors.toList());
			if(!kFilter.isEmpty()) {
				return true;
			}
		}
		return false;
	}
	private void SearchProduct(Scanner kRead) {
		String kSearch;
		if(!kCheckEmptyProducts()) {
				kSearch = (String) KFunc.kQuestion(kRead,"Veuillez taper un nom du produit chercher :","string");
				List<Product> kFilter = this.kProducts.stream().filter(kElement -> kElement.getName().toString().toLowerCase().contains(kSearch.toLowerCase())).collect(Collectors.toList());
				if(!kFilter.isEmpty()) {
					kFilter.forEach(kElement -> System.out.printf(" - [%d] %s - %.2f€ (Stock : %d)\n", kElement.getID(),kElement.getName(),kElement.getPrice(),kElement.getQty()));
				} else {
					System.out.println("aucun élément correspond à votre recherche.");
				}
		}
	}
	private void ShowProducts() {
		if(!kCheckEmptyProducts()) {
			for(Product kElement : this.kProducts) {
				System.out.printf(" - [%d] %s - %.2f€ (Stock : %d)\n", kElement.getID(),kElement.getName(),kElement.getPrice(),kElement.getQty());
			}
		}
	}
	private void DeletProduct(Scanner kRead) {
		int kID;
		if(!kCheckEmptyProducts()) {
			kID = (int) KFunc.kQuestion(kRead,"Veuillez taper l'ID du produit :","integer");
			if(kCheckProductID(kID)) {
				this.kProducts.removeIf(kElement -> kElement.getID() == kID);
				System.out.println("Référence produit supprimé.");
			}
		}
	}
	private void UpdateQty(Scanner kRead) {
		int kID;
		int kk;
		if(!kCheckEmptyProducts()) {
			kID = (int) KFunc.kQuestion(kRead,"Veuillez taper l'ID du produit :","integer");
			if(kCheckProductID(kID)) {
				for(kk=0;kk<this.kProducts.size();kk++) {
					if(this.kProducts.get(kk).getID()==kID) {
						this.kProducts.get(kk).setQty((int) KFunc.kQuestion(kRead,"Veuillez taper la nouvelle quantité :","integer"));;
						System.out.println("Quantité mise à jour avec succés.");
						return;
					}
				}
			}
		}
	}
	private int kGenerateID() {
		return this.kProducts.stream().mapToInt(Product::getID).max().orElse(0)+1;
	}
	private boolean kCheckProductID(int kId) {
		if(this.kProducts.stream().filter(kElement -> kElement.getID() == kId).count()>0) return true;
		System.out.printf("Le produite avec l'id: %d, n'existe pas\n",kId);
		return false;
	}
	private boolean kCheckEmptyProducts() {
		if(this.kProducts.isEmpty()) {
			System.out.println("Il n'y a aucun produit dans le catalogue.");
			return true;
		}
		return false;
	}
	public void catalogmenu(Scanner kInput) {
		Integer kChooseMenu;
		kChooseMenu=0;
		while( kChooseMenu != 6 ) {
			kChooseMenu = (Integer) KFunc.kQuestion(kInput, displaymenu(),"integer");
			if(kChooseMenu>0 && kChooseMenu<7) {
				switch (kChooseMenu) {
					case 1: //add product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						this.AddProduct(kInput);
						break;
					case 2: //search product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						this.SearchProduct(kInput);
						break;
					case 3: //show all products
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						this.ShowProducts();
						break;
					case 4: //update the quantity of one product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						this.UpdateQty(kInput);
						break;
					case 5: //delete a product
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						this.DeletProduct(kInput);
						break;
					case 6: //exit program
						System.out.printf("Choix %d sélectionner\n", kChooseMenu);
						System.out.println("Retour au menu principal.");
						break;
					default:
						break;
				}
			} else {
				System.out.println("Veuillez taper un chiffre entre 1 et 6.");
			}
		}
	}
	private String displaymenu() {
		String kMenu;
		kMenu = new String();
		kMenu = "\n---- MENU ----\n";
		kMenu = kMenu + "1. Ajouter un produit\n";
		kMenu = kMenu + "2. Rechercher un produit\n";
		kMenu = kMenu + "3. Afficher tous les produits\n";
		kMenu = kMenu + "4. Mettre à jour le stock d'un produit\n";
		kMenu = kMenu + "5. Supprimer un produit\n";
		kMenu = kMenu + "6. Retour\n";
		return kMenu;
	}
}
