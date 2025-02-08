package tp013;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import krohaard.KFunc;

public class Catalog {
	private ArrayList<Product> kProducts;

	Catalog(){
		this.kProducts = new ArrayList<>();
	}
	public void AddProduct(Scanner kRead) {
		Product kProduct;
		Integer kQuantity;
		String kName;
		Double kPrice;

		kName = (String) KFunc.kQuestion(kRead, "Entrez le nom du produit :");
		kPrice = (Double) KFunc.kQuestion(kRead, "Entrez le prix :","double");
		kQuantity = (Integer) KFunc.kQuestion(kRead, "Entrez la quantité :");

		kProduct = new Product(kGenerateID(),kName, kPrice, kQuantity);
		this.kProducts.add(kProduct);
	}
	public void SearchProduct(Scanner kRead) {
		Integer kID;
		kID = 0;
		if(!kCheckEmptyProducts()) {
			while(kID<1 && kID>3) {
				kID = (Integer) KFunc.kQuestion(kRead,"Veuillez taper l'ID du produit :","integer");
			}
		}
	}
	public void ShowProducts() {
		if(!kCheckEmptyProducts()) {
			for(Product kElement : this.kProducts) {
				System.out.printf(" - [%d] %s - %.2f€ (Stock : %d)\n", kElement.getID(),kElement.getName(),kElement.getPrice(),kElement.getQty());
			}
		}
	}
	public void DeletProduct(Scanner kRead) {
		int kID;
		int kk;
		if(!kCheckEmptyProducts()) {
			kID = (int) KFunc.kQuestion(kRead,"Veuillez taper l'ID du produit :","integer");
			if(kCheckProductID(kID)) {
				for(kk=0;kk<this.kProducts.size();kk++) {
					if(this.kProducts.get(kk).getID()==kID) {
						this.kProducts.remove(kk);
						System.out.println("Référence produit supprimé.");
						continue;
					}
				}
			}
		}
	}
	public void UpdateQty(Scanner kRead) {
		int kID;
		int kk;
		if(!kCheckEmptyProducts()) {
			kID = (int) KFunc.kQuestion(kRead,"Veuillez taper l'ID du produit :","integer");
			if(kCheckProductID(kID)) {
				for(kk=0;kk<this.kProducts.size();kk++) {
					if(this.kProducts.get(kk).getID()==kID) {
						this.kProducts.get(kk).setQty((int) KFunc.kQuestion(kRead,"Veuillez taper la nouvelle quantité :","integer"));;
						System.out.println("Référence produit supprimé.");
						continue;
					}
				}
			}
		}
	}
	private int kGenerateID() {
		if (this.kProducts.isEmpty()) return 1;
		return kProducts.getLast().getID()+1;
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
}
