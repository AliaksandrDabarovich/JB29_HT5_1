package by.ad.les08;
import java.util.Random;
import java.util.Arrays;

/*
 * 1. В массив A [N] занесены натуральные числа. 
 * Найти сумму тех элементов, которые кратны данному К. 
 */
public class Task01 {

	public static void main(String[] args) {
		int N;
		int K;
		int sum;
		
		
		
		N=10;
		K=5;
		sum=0;
		
		int [] arr = new int [N];;
		Task01.mas(arr, N);
		sum = Task01.compare(arr, K, sum);
		print (sum);

	}
	
	public static void mas (int [] arr, int N) {
		Random rand = new Random ();
		
		for (int i=0; i<N; i++) {
			arr [i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static int compare (int [] arr, int K, int sum) {
		for (int j=0; j<arr.length; j++) {
			if (arr[j]%K == 0) {
				sum+=arr[j];
			}
			
		}
		return sum;
		
	}
	
	public static void print (int sum) {
		System.out.println("Сумма равна: "+sum);
	}

}
