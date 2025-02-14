/**
 * 
 */
package tp014;

/**
 * 
 */
public class Product {
	private int kID;
	private String kName;
	private double kPrice;
	private int kQty;


	protected Product(int oID, String oName, double oPrice, int oQty) {
		this.kID = oID;
		this.kName = oName;
		this.kPrice = oPrice;
		this.kQty = oQty;
	}
	/**
	 * @return the kQty
	 */
	public int getQty() {
		return kQty;
	}
	/**
	 * @param kQty the kQty to set
	 */
	public void setQty(int kQty) {
		this.kQty = kQty;
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
	 * @return the kName
	 */
	public String getName() {
		return kName;
	}
	/**
	 * @param kName the kName to set
	 */
	public void setName(String kName) {
		this.kName = kName;
	}
	/**
	 * @return the kPrice
	 */
	public double getPrice() {
		return kPrice;
	}
	/**
	 * @param kPrice the kPrice to set
	 */
	public void setPrice(double kPrice) {
		this.kPrice = kPrice;
	}
}
