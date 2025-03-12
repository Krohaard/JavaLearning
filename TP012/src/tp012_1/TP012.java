/**
 * 
 */
package tp012_1;

class OddEvent extends Thread{
	public void run(){
		for(int kk=0;kk<101;kk++) {
			if ( (kk % 2 == 0) ) System.out.println("nombre impaire : " + kk);
		}
	}
}
class EvenEvent extends Thread{
	public void run(){
		for(int kk=0;kk<101;kk++) {
			if ( (kk % 2 != 0) ) System.out.println("nombre paire : " + kk);
		}
	}
}
/**
 * 
 */
public class TP012 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvent kOdd = new OddEvent();
		EvenEvent kEven = new EvenEvent();
		kOdd.start();
		kEven.start();
	}

}
