package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 12. Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами. 
 */
public class Task12 {

	public static void main(String[] args) {
		int n;
		float[] mas;
		float sum;
		n = 20;
		mas = arr(n);
		printArr(mas);
		
		sum=calc(mas);
		print (sum);
	}

	public static float[] arr(int n) {
		float[] arr = new float[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rand.nextFloat() * 10;
		}
		return arr;

	}

	public static float calc(float[] arr) {
		
		float sum;
		sum=0;
		for (int i = 0; i < arr.length; i++) {

			boolean boo;
			boo = false;

			for (int j = i - 1; j > 1; j--) {
				boo = false;
				if (i % j != 0) {
					boo = true;
				} else {
					boo = false;
					break;
				}
				
			}
			
			if (boo==true) {
				sum+=arr[i];
			}
			
		}
		return sum;
	}
	public static void print(float a) {
		System.out.println(a);
	}
	public static void printArr(float[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
