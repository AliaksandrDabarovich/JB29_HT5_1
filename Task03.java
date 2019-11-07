package by.ad.les08;
import java.util.Arrays;
import java.util.Random;
/*
 * 3. Дана последовательность целых чисел а1 а2,..., аn . 
 * Выяснить, какое число встречается раньше - положительное или отрицательное. 
 */
public class Task03 {

	public static void main(String[] args) {
		
		int n;
		n=12;
		int [] arr = new int [n];
		Task03.mas(arr);
		Task03.calc(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void mas (int [] arr) {
		Random rand = new Random ();
		for (int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(200)-100;
		}
		
	}
	
	public static void calc (int [] arr) {
		for (int j=0; j<arr.length; j++) {
			if (arr[j]>0) {
				System.out.println("Положительное число " + arr[j]+ " встретилось раньше");
				break;
			} else if (arr[j]<0) {
				System.out.println("Отрицательное число " + arr[j]+ " встретилось раньше");
				break;
			}
		}
		
	}

}
