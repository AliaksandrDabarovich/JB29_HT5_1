package by.ad.les08;
import java.util.Random;

import java.util.Arrays;
/*
 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. 
 * Указать наименьшую длину числовой оси, содержащую все эти числа.
 */
public class Task06 {

	public static void main(String[] args) {
		 int n;
		
		 int min;
		 int max;
		 n=7;
		 int [] arr = new int [n];
		 
		 
		 Task06.mas(arr);
		 min=arr[0];
		 max=arr[0];
		 int valu = Task06.calc(arr, min, max);
		 
		 Task06.print(valu, arr);
		 

		}
		
		public static void mas(int []arr) {
			Random rand = new Random ();
			for (int i=0; i<arr.length; i++) {
			arr[i]= rand.nextInt(100);	
			}
		}
		public static int calc(int [] arr, int min, int max) {
			 int valu;
			 
			for (int j=0; j <arr.length; j++) {
				if (arr[j]>max) {
					max=arr[j];
				}
				if (arr[j]<min) {
					min=arr[j];
				}
				
			}
			valu=max-min;
			
			return valu;
			
		}
		
		public static void print (int valu, int []arr) {
			System.out.println(Arrays.toString(arr));
				System.out.println("наименьшая длина числовой оси "+valu);
			

			}
			
			
		}


