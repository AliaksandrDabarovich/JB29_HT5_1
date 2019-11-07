package by.ad.les08;

import java.util.Random;
import java.util.Arrays;

/*
 * 8. Дан массив действительных чисел, размерность которого N. 
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. 
 */
public class Task08 {

	public static void main(String[] args) {
		int[] arr;
		int n;
		int pol;
		int otrits;
		int nul;

		pol = 0;
		otrits = 0;
		nul = 0;
		n = 30;

		arr = mas(n);
		int [] result=calc(pol, otrits, nul, arr);
		System.out.println("Нулевых: "+result[0]+"\n"+
				"Положительных: "+result[1]+"\n"+
				"Отрицательных: "+result[2]);

	}

	public static int[] mas(int n) {
		int[] arr = new int[n];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100)-40;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static int[] calc(int pol, int otrits, int nul, int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				nul++;
			} else if (arr[j] > 0) {
				pol++;
			} else {
				otrits++;
			}
		}
		
		int [] result = new int [3];
		result [0]=nul;
		result [1]=pol;
		result [2]=otrits;
		
		return result;
	}

}
