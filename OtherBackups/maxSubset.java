package javaclasses;

import java.util.Scanner;

public class maxSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int N=sc.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}

		for(int i=2;i<N;i++) {
			arr[i]=(arr[i]+arr[i-2])>arr[i-1]?(arr[i]+arr[i-2]):arr[i-1];
		}
		
		System.out.println(arr[N-1]);
	}

}
