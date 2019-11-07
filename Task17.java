package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 17. Дана последовательность целых чисел n aaa ,,, 21  . 
 * Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны ) ,, ,min( 21 n aa a  . 
 */
public class Task17 {

	public static void main(String[] args) {
		int[] mas;
		int[] newMas;
		int N;
		int min;
		
		
		N = 10;		

		mas = arr(N);
		printArr(mas);
		min = min(mas);
		print (min);
		newMas=delete(mas, min);
		printArr(newMas);

	}
	
	
	
	public static int[] delete(int []arr, int min) {
		int count;
		count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==min) {
				count++;				
			}
		}
		
		int []newMas=new int [arr.length-count];
		count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=min) {				
				newMas[count]=arr[i];
				count++;				
			}
		}
		
		return newMas;
		
		
	}
	
	public static int min(int[] arr) {
		int min;
		
		
		min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				
			}
		}
		return min;
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
