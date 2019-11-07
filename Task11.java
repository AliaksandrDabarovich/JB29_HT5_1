package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 11. Даны натуральные числа а1 ,а2 ,..., аn . 
 * Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 
 
 */
public class Task11 {

	public static void main(String[] args) {
		int M;
		int L;		
		int n;
		int [] mas;
		
		
		M=5;
		L=2;
		n = 20;		
		mas = arr(n);
		printArr(mas);
		calc(mas, M, L);
		

	}
	
	public static int[] arr(int n) {
		int[] arr = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(25);
		}
		return arr;

	}
	
	public static void calc(int[]arr, int M, int L) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%M==L) {
				print(arr[i]);
			}
		}	
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
