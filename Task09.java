package by.ad.les08;

import java.util.Random;
import java.util.Arrays;

/*
 * 9. Даны действительные числа а1 ,а2 ,..., аn . 
 * Поменять местами наибольший и наименьший элементы. 

 */
public class Task09 {

	public static void main(String[] args) {
		int n;
		n = 5;
		int[] mas;
		int minInd;
		int maxInd;

		mas = arr(n);
		minInd= min(mas);
		maxInd= max(mas);
		print (mas);
		print (calc(mas,minInd,maxInd));
		
		
		
		
	}

	public static int[] arr(int n) {
		int[] arr = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(100);
		}
		return arr;

	}

	public static int min(int[] arr) {
		int min;
		int minInd;
		minInd=0;
		min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minInd=i;
			}
		}
		return minInd;
	}

	public static int max(int[] arr) {
		int max;
		int maxInd;
		maxInd=0;
		max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxInd=i;
			}
		}
		return maxInd;
	}
	
	public static int[] calc(int[]arr, int minInd, int maxInd) {
		int timeVar;
		
		timeVar=arr[minInd];
		arr[minInd]=arr[maxInd];
		arr[maxInd]=timeVar;
		return arr;		
		
	}
	
	
	public static void print(int []arr) {
		System.out.println(Arrays.toString(arr));
	}

}
