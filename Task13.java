package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 13. Определить количество элементов последовательности 
 * натуральных чисел, кратных числу М и заключенных в промежутке от L до N. 
 */
public class Task13 {

	public static void main(String[] args) {
		int L;
		int N;
		int M;
		int[] mas;
		int n;
		int count;

		M = 3;
		L = 20;
		N = 100;
		n = 5;
		mas = arr(n);
		
		printArr(mas);
		count=calc(mas, M, L, N);
		print(count);

	}

	public static int[] arr(int n) {
		int[] arr = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextInt(25);
		}
		return arr;
	}

	public static int calc(int[] arr, int M, int L, int N) {
		int count;
		count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % M == 0 && arr[i] > L && arr[i] < N) {
				count++;
			}
		}
		return count;
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
