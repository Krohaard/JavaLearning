package tp5;

import java.util.Arrays;
import java.util.Scanner;

public class TP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kSearchDivider(25));
	}
	public static int[] kSearchDivider(float kValue) {
		int kDivider;
		int kk;
		int jj=0;
		int[] kResultTemp;
		int kIntTemp;
		float kTemp;
		kResultTemp = new int[jj];
		kDivider=(int) (kValue/2);
		for(kk=1;kk<=kDivider;kk++) {
			kIntTemp = (int) (kValue / kk);
			kTemp = (kValue/kk)-kIntTemp;
			if(kTemp==0) {
				kResultTemp = new int[jj+1];
				kResultTemp[jj]=kk;
				jj++;
			}
		}
		return kResultTemp;
	}
	public static int[] kIncreaseArray(int[] kData) {
		int[] kDataTemp;
		int kSizeArray;
		int kk;
		kSizeArray = kData.length;
		kDataTemp = new int[kSizeArray + 1];
		for(kk=0;kk<kSizeArray) {
			kDataTemp[kk]=kData[kk];
		}
		return kDataTemp;
	}
}
