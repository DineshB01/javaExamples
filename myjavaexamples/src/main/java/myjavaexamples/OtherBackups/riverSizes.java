package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class riverSizes {
	static List<Integer> lis=new ArrayList<>();
	static int[][] arr;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	arr = new int[5][5];

	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			arr[i][j]=sc.nextInt();
			
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i][j]==1) {
				int sum=0;
				sum=verifyPosition(i,j);
				lis.add(sum);
			}
			
		}
	}
	
	for(int a : lis) {
		System.out.println(a);
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
			
		}
		System.out.println();
	}
}

static int verifyPosition(int i,int j) {
	int sum=1;
	arr[i][j]=0;
	if(i+1<arr.length) {
		if(arr[i+1][j]==1)
		sum+=verifyPosition(i+1,j);
	}
	if(j+1<arr[0].length) {
		if(arr[i][j+1]==1)
		sum+=verifyPosition(i,j+1);
	}

	return sum;
}


}
