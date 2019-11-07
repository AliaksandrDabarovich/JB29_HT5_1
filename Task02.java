package by.ad.les08;
import java.util.ArrayList;
/*
 * 2.  В целочисленной последовательности есть нулевые элементы. 
 * Создать массив из номеров этих элементов. 
 */
public class Task02 {

	public static void main(String[] args) {
		int [] arr = {0,15,9,20,0,6,7,0,3,2,9,0};
		ArrayList <Integer> mas = new ArrayList <Integer>();
				
		Task02.calc(arr, mas);
		Task02.print(mas);
		
		

	}
	
	public static void print (ArrayList mas) {
		for (int j=0; j<mas.size(); j++) {
			System.out.println(mas.get(j));
		}
	}
	
	
	public static void calc (int [] arr, ArrayList mas) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == 0) {
				mas.add(i);
				
			}
		}
	}

}
