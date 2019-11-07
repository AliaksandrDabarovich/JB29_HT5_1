package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 18. В массиве целых чисел с количеством элементов n 
 * найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них. 
 */
public class Task18 {

	public static void main(String[] args) {

		int[] mas;
		int [] quan;
		int max;

		int N;

		N = 8;

		mas = arr(N);
		printArr(mas);
		max=calc(mas);
		print (max);

	}

	public static int calc(int[] arr) {
		int [] quan=new int[arr.length];
		
		
		int count;
		int countMin;
		int max;
		for (int i = 0; i < arr.length; i++) {
			
			
			
			
			count=0;
			for (int j=0; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			quan[i]=count;
		}
		/* return quan; */
		System.out.println(Arrays.toString(quan));
		max=quan[0];
		countMin=arr[0];
		for (int i=1;i<arr.length;i++) {
			if (max<quan[i]) {
				max=quan[i];
				countMin=arr[i];
			}
		}
		
		for (int j=0;j<arr.length; j++) {
			if (quan[j]==max) {
				if(arr[j]<countMin) {
					countMin=arr[j];
				}
			}
		}
		
		return countMin;
	
	}

	public static int[] arr(int N) {
		int[] arr = new int[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			arr[i] = rand.nextInt(8);
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
