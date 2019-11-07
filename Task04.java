package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 4. Дана последовательность 
 * действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. 
 */
public class Task04 {

public static void main(String[] args) {
		boolean boo;
		int n;
		boo=false;
			
		n=11;
		int [] arr = new int [n];
		Task04.mas(arr);
		Task04.calc(arr, boo);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void mas (int [] arr) {
		Random rand = new Random ();
		for (int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		
	}
	
	public static void calc (int [] arr, boolean boo) {
		
		if (arr.length%2==0) {
			for (int j=0; j<arr.length-1; j++) {
				if (arr[j]<arr[j+1]) {
					boo=true;
					
					
				} else {
					boo=false; 
					break;
			}
			}
		} else {
			for (int j=0; j<arr.length-2; j++) {
				if (arr[j]<arr[j+1] && arr[j+1]<arr[j+2] ) {
					boo=true;
					
				} else {
					boo=false;
					break;
			}
		
	}

}
if (boo==true) {System.out.println(boo +" Последовательность возрастающая");}
else {System.out.println(boo +" Последовательность НЕ возрастающая");}

}
	
	
}