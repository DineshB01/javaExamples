package algorithmsandds;

import java.util.Scanner;

public class maxIncreasingSubsequenceMaintainOrder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of array : ");
	int N= sc.nextInt();
	int[] arr=new int[N];
	int[] res=new int[N];
	int[] ind=new int[N];
	System.out.println("Enter array elements :");
	for(int i=0;i<N;i++) {
		arr[i]=sc.nextInt();
	}
	res[0]=arr[0];
	
	for(int i=1;i<N;i++) {
		for(int j=0;j<i;j++) {
			if(arr[j]<arr[i]) {
				int temp=res[i];
				res[i]=res[i]>(arr[i]+res[j])?res[i]:arr[i]+res[j];
				if(temp!=res[i]) {
					ind[i]=j;
				}
			}
		}
	}
	
	for(int i=0;i<N;i++) {
		System.out.println(ind[i]+" "+res[i]);
	}
	
	print(res,ind,4);
}

static void print(int[] arr,int[] ind,int val) {
	System.out.print(arr[val]+" ");
	if(val<=0) return;
	print(arr,ind,ind[val]);
}
}
