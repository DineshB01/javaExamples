package algorithmsandds;

import java.util.Scanner;

public class minRewards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		int[] res = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			res[i]=1;
		}
		//iterate left to right
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				res[i]=res[i-1]+1;
			}
		}
		// iterate right to lkeft
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>arr[i+1]) {
				res[i]=res[i+1]+1>res[i]?res[i+1]+1:res[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(res[i]);
		}

	}

}
