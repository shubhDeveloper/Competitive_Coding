package com.array.problems;

/*****
 * 
 * @author shubham panchal
 * 
 *         PROBLEM NO 1 : REVERSE THE ARRAY. (GeeksForGeeks)
 * 
 *         Input : {1,2,3,4,5,6,7,8,9}, Output : {9,8,7,6,5,4,3,2,1)
 * 
 *         Input : coading, Output : gnidaoc
 *         
 * 
 *****/
public class Problem_1 {

	static int[] reverseArray(int arr[], int n) {
		int t = 0;
		int[] tempArr = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			tempArr[t] = arr[i];
			t++;
		}
		return arr;
	}

	static String reverseArray(String str, int n) {
		String temp = "";
		for (int i = n - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		
		// for int Array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int len = arr.length; // return the length of array
		int[] tem = reverseArray(arr, len);
		// print the return array
		for (int ar : tem) {
			System.out.print(ar + " ");
		}

		// For string
		String str = "coding";
		int size = str.length();
		String st = reverseArray(str, size);
		//Print return value
		System.out.println(st);
	}

}
