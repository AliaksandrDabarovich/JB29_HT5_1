package by.ad.les08;

import java.util.Random;
import java.util.Arrays;

/*
 * 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. 
 * Подсчитать количество замен. 
 */
public class Task07 {

	public static void main(String[] args) {
		int z;
		int n;
		int sum;
		int [] arr;

		n = 12;
		z = 25;
		sum = 0;
		arr=Task07.mas(n);
		Task07.calc(arr, z, sum);
		

		
	}
	
	public static void calc(int [] arr, int z, int sum) {
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] > z) {
			arr[i] = z;
			sum++;

		}
	}

	System.out.println(Arrays.toString(arr)+"\n"+sum);}
	
	
	public static int [] mas (int n) {
		Random rand = new Random();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);

		}
		System.out.println(Arrays.toString(arr));
		return arr;
		
		
	}

}
