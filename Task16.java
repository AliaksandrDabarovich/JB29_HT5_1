package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 16. Даны действительные числа 𝑎1,𝑎2,…,𝑎2𝑛. Найти 
), ,,max( 1 12221 + − + ++ nnnn aa aa aa  . 
 */
public class Task16 {

	public static void main(String[] args) {
		int[] mas;
		int N;
		N = 10;
		
		
		mas = arr(N);
		printArr(mas);
		calc(mas, N);
	}
	
	public static void calc(int []arr, int N) {
		int max;
		max=arr[0]+arr[N-1];
		for (int i=0; i<arr.length/2;i++) {
			
			if(max<arr[i]+arr[(arr.length-(i+1))]) {
				max=arr[i]+arr[(arr.length-(i+1))];
			}			 
		}
		print(max);
	}
	
	
	
	public static int[] arr(int N) {
		int[] arr = new int[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			arr[i] = rand.nextInt(100);
		}
		return arr;
	}
	
	public static void print(int a) {
		System.out.println(a);
	}

	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}


}
