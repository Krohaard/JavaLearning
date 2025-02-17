/**
 * 
 */
package tp014;

import java.util.HashMap;

/**
 * 
 */
public class Order {
	private int kID;
	private HashMap<Product, Integer> kShoppingCart;
	private String kStatus;
	private double kTotalOrder;
	protected Order(int oId) {
		this.kID = oId;
		this.kShoppingCart = new HashMap<>();
		this.kStatus = "En attente";
		this.kTotalOrder = 0;
	}
	/**
	 * @return the kID
	 */
	public int getID() {
		return kID;
	}
	/**
	 * @param kID the kID to set
	 */
	public void setID(int kID) {
		this.kID = kID;
	}
	/**
	 * @return the kShoppingCart
	 */
	public HashMap<Product, Integer> getShoppingCart() {
		return kShoppingCart;
	}
	public void addProduct(Product kElement,Integer kQty) {
		this.kShoppingCart.put(kElement, kQty);
//		this.kTotalOrder;
	}
	/**
	 * @return the kStatus
	 */
	public String getStatus() {
		return kStatus;
	}
	/**
	 * @param kStatus the kStatus to set
	 */
	public void setStatus(String kStatus) {
		this.kStatus = kStatus;
	}
	/**
	 * @return the kTotalOrder
	 */
	public double getTotalOrder() {
		return kTotalOrder;
	}
	/**
	 * @param kTotalOrder the kTotalOrder to set
	 */
	public void setTotalOrder(double kTotalOrder) {
		this.kTotalOrder = kTotalOrder;
	}
	
}
