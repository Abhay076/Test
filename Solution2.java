package abc;

import java.util.Scanner;

public class Solution2 {

	
//	Q.2 You are given an array of length N (1 < N <= 100)
//	and a number K. Print the array after K rotations in 
//	clockwise direction.
//	E.g. 
//	N = 10, K = 3
//	Arr = [1,2,3,4,5,6,7,8,9,10]
//	after K rotations
//	Arr = [4,5,6,7,8,9,10,1,2,3]
//
//	Please mention use of any in-built javascript function is
//	not allowed like shift, unshift, substr etc.
	
	public static void rotates(int arr[],int d,int n) {
		int p=1;
		while(p<=d) {
			int last =arr[0];
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[n-1]=last;
			p++;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated methods
//	
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		int k =6;
		rotates(arr, k, n);

		
		

	}

}
