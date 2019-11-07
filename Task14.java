package by.ad.les08;

import java.util.Arrays;
import java.util.Random;

/*
 * 14. Дан одномерный массив A[N]. Найти: 
),
,,
min()
,, ,max( 1 231242 + + k k a aa aa a   
 */
public class Task14 {

	public static void main(String[] args) {		
		int[] mas;
		int N;
		int maxim;
		int minim;
		
		
		N = 5;
		mas = arr(N);
		printArr(mas);
		maxim=max(mas);
		minim=min(mas);
		print (maxim);
		print (minim);
		
		
	}
	
	
	public static int[] arr(int N) {
		int[] arr = new int[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			arr[i] = rand.nextInt(25);
		}
		return arr;
	}
	
	public static int max (int [] arr) {
		int maxim;
		maxim=arr[1];
		for (int i=1; i<arr.length; i+=2) {
			if (arr[i]>maxim) {
				maxim=arr[i];
			}			
		}
		return maxim;
	}
	
	public static int min (int [] arr) {
		int minin;
		minin=arr[0];
		for (int i=0; i<arr.length; i+=2) {
			if (arr[i]<minin) {
				minin=arr[i];
			}			
		}
		return minin;
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
