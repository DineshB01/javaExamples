package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;

import java.util.Scanner;

public class sincyclecheck {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of array elements : ");
		int N=sc.nextInt();
		int[] arr = new int[N];
		int[] vis = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int sI=0;
		
		
		
		while(N!=0) {
		
			vis[sI]=1;
			sI=sI+arr[sI];
			if(sI>=N) {
				sI%=arr.length;
			}
			
			if(sI<0) {sI%=arr.length;
					sI+=arr.length;
					
			}
			
			for(int a : vis) {
				System.out.print(a+" ");
			}
			System.out.println();
			System.out.println("ind"+sI);
			
			N--;
			
		}
		
		

	}

}
