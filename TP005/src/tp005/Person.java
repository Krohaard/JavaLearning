/**
 * 
 */
package tp005;

/**
 * 
 */
public class Person {
	private String kName;
	private int kAge;

	Person(String oName,int oAge){
		this.kName = oName;
		this.kAge = oAge;
	}
	public void displayDetails() {
		System.out.printf("La personne s'appelle %s et à %d ans.\n",this.kName,this.kAge);
	}
}
