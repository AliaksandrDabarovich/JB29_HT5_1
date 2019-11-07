package by.ad.les08;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
/*
 * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
 * Создать массив из четных чисел этой последовательности. 
 * Если таких чисел нет, то вывести сообщение об этом факте. 
 
 */

public class Task05 {
	
	public static void main(String[] args) {
	 int n;
	 n=7;
	 
	 int [] arr = new int [n];
	 Task05.mas(arr);
	 ArrayList <Integer> arLi = Task05.calc(arr);
	 Task05.print(arLi);
	 System.out.println(Arrays.toString(arr));

	}
	
	
	
	public static void mas(int []arr) {
		int n;
		
		Random rand = new Random ();
		for (int i=0; i<arr.length; i++) {
		arr[i]= rand.nextInt(100);	
		}
	}
	public static ArrayList<Integer> calc(int []arr) {
		ArrayList <Integer> arLi = new ArrayList <Integer>();
		for (int j=0; j <arr.length; j++) {
			if (arr[j]%2 == 0) {
				arLi.add(arr[j]);
			}
			
		}
		return arLi;
	}
	
	public static void print (ArrayList <Integer> arLi) {
		if (arLi.size()==0) {
			System.out.println("В массиве нет чётных чисел");
		} else {
			for (int k = 0; k < arLi.size(); k++) {
				System.out.println(arLi.get(k));
			}

		}
		
		
	}
	
	}
