package Adarsh;

import java.util. *;

public class Compare_array {
	public static void main(String args []) {
    int i,j,n,b;	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Size Of an Array\n");
	n = sc.nextInt();
	System.out.println("\nEnter The " + n + " Numbers\n");
	 int[] arr1 = new int[n];
	for (i = 0; i < n; i++) {
		arr1[i] = sc.nextInt(); 
	}System.out.println("Enter The Size Of an Array\n");
	b = sc.nextInt();
	System.out.println("\nEnter The " + b + " Numbers\n");
	int[] arr2 = new int[b];
	for (j = 0; j < b; j++) {
		arr2[j] = sc.nextInt(); 
	}if(Arrays.equals(arr1, arr2)) {
		System.out.println("both array are equal");
	}else {
	    System.out.println("the arrays are not equal");
	}
	}
}
