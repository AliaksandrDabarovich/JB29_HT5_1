package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 15. Дана последовательность действительных чисел n aaa ,,, 21  . 
 * Указать те ее элементы, которые принадлежат отрезку [с, d]. 
 */
public class Task15 {

	public static void main(String[] args) {
		int[] mas;
		int N;
		int c;
		int d;

		c = 15;
		d = 55;
		N = 10;
		mas = arr(N);
		printArr(mas);

		calc(mas, c, d);

	}

	public static int[] arr(int N) {
		int[] arr = new int[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			arr[i] = rand.nextInt(100);
		}
		return arr;
	}

	public static void calc(int[] arr, int c, int d) {
		for (int x : arr) {
			if (x <= d && x >= c) {
				print(x);
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
