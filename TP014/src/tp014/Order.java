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
	/**
	 * @param kShoppingCart the kShoppingCart to set
	 */
	public void setShoppingCart(HashMap<Product, Integer> kShoppingCart) {
		this.kShoppingCart = kShoppingCart;
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
	
}
