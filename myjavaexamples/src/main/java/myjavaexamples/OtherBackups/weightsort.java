package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;

import java.util.Scanner;

public class weightsort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	sort[] arr = new sort[3];
	
	for(int i=0;i<3;i++) {
		int num=sc.nextInt();
		arr[i] = new sort(num);
		
		
	}
	
	System.out.println("Result");
	
	for(int i=0;i<3;i++) {
		arr[i].calculateWeight();
		System.out.println(arr[i].weight);
		
	}
	
}
}

class sort{
	int num;
	int weight=0;
	sort(int num){
		this.num=num;
		
	}
	void calculateWeight() {
		if(isPerfectSquare(this.num)) {
			this.weight=5;
		}
		else
		if(this.num%2==0) this.weight=3;
		else
		if(this.num%4==0&&this.num%6==0) this.weight=4;
	}
	
	boolean isPerfectSquare(int num) {
		
		int left =0; int right = num;
		while(left<right) {
			int mid=(left+right)/2;
			
			if(mid*mid==num) {
				return true;
			}
			
			if(mid*mid<num) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		return false;
		
	}
	
}