package by.ad.les08;
import java.util.Random;
import java.util.Arrays;
/*
 * 10. Даны целые числа а1 ,а2 ,..., аn . 
 * Вывести на печать только те числа, для которых аi > i. 
 */
public class Task10 {

	public static void main(String[] args) {
		int n;
		n = 5;
		int [] mas;
		mas = arr(n);
		printArr(mas);
		calc(mas);
		
		
	}
	
	public static int[] arr(int n) {
		int[] arr = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(15);
		}
		return arr;

	}
	
	
	public static void calc(int []arr) {
		
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>i) {
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
