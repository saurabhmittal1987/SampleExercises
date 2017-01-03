package mypackage;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ArrayImplementation {

	public static void main(String []args){
//		int [][]array = {{1,2,3,4,5},
//						{6,7,8,9,10},
//						{11,12,13,14,15},
//						{16,17,18,19,20},
//						{21,22,23,24,25}};
//		
//		ArrayImplementation arrayImplementation = new ArrayImplementation();
//		arrayImplementation.printArrayLeftToRight(array[0]);
//		arrayImplementation.printArrayRightToLeft(array[0]);
//		arrayImplementation.reverseArray(array[0]);
	
		Pattern pattern = Pattern.compile("[A-Za-z0-9][A-Za-z0-9-/&@., ]*[A-Za-z0-9]+");
        System.out.println(pattern.matcher("a@g").matches());
	}
	
	public void printArrayLeftToRight(int []array){
		System.out.print("\nArray Traversal (left to right): ");
		for(int value: array){
			System.out.print(value +" ");
		}
	}
	
	public void printArrayRightToLeft(int []array){
		System.out.print("\nArray Traversal (right to left): ");
		for(int counter = array.length-1; counter>=0;counter--){
			System.out.print(array[counter] +" ");
		}
	}
	
	public void reverseArray(int []array){
		int []array2 = Arrays.copyOf(array, array.length);
		for(int start = 0,end = array2.length-1;end-start>0;start++,end--){
			array2[start] = array2[start] + array2[end] - (array2[end] = array2[start]);
		}
		System.out.print("\nReversed array: ");
		for(int value: array2){
			System.out.print(value +" ");
		}
	}
	
}
