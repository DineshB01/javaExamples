package javaclasses;

import java.util.Scanner;
//two number sum,3 number sum,quicksort
public class sum {
static int[] arr;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size : ");
	int n = sc.nextInt();
	 arr=new int[n];
	System.out.println("Enter array elements : ");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter number to search");
	int numToSearch=sc.nextInt();
	int start=0;int end=n-1;
	
	qsort(0,arr.length-1);
	for(int s :arr) System.out.print(s+" ");
	
	twonumsum(arr, start, end, numToSearch);
	threenumsum(arr, start,end ,numToSearch);
	
	sc.close();
	
}

public int[] quicksort(int arr[],int l, int r) {
	
	
	
	return arr;
	
}
//below print all two number possibilities
static void twonumsum(int arr[],int start, int end,int numToSearch) {
	while(start<end) {
		int sum=arr[start]+arr[end];
		if(sum==numToSearch) {
			System.out.println(arr[start]+" "+arr[end]);
			end--;
		}
		else
			if(sum>numToSearch) {
				end--;
			}
			else
				start++;
	}
}

static void returntwonumsum(int arr[],int start, int end,int numToSearch) {
	while(start<end) {
		int sum=arr[start]+arr[end];
		if(sum==numToSearch) {
			System.out.println(arr[start]+" "+arr[end]);
			end--;
		}
		else
			if(sum>numToSearch) {
				end--;
			}
			else
				start++;
	}
}

static void threenumsum(int arr[],int start, int end,int numToSearch) {
	
	while(start<arr.length-2) {
		int p1=start+1,p2=end;
		while(p1<p2) {
			int sum=arr[start]+arr[p1]+arr[p2];
			if(sum==numToSearch) {
				System.out.println(arr[start]+" "+arr[p1]+" "+arr[p2]);
				p2--;
			}
			else
				if(sum>numToSearch) {
					p2--;
				}
				else
					p1++;
		}
		start++;
		
		
	}
}

static void qsort(int l,int r){
	if(l<r) {
		int mid=partition(l,r);
		qsort(l,mid-1);
		qsort(mid+1,r);
	}
	
	
	
}

static int partition(int l,int r) {
	
	int findelementposition=arr[l];
	
	while(l<r) {
		if(arr[l]==findelementposition) {
			if(arr[l]<arr[r]) {
				r--;
				
			}
			else {
				arr[l]=arr[r];
				arr[r]=findelementposition;
				l++;
			}
		}
		else {
			if(arr[l]<arr[r]) {
				l++;
				
			}
			else {
				arr[r]=arr[l];
				arr[l]=findelementposition;
				r--;
			}
		}
	}
	
	return (l==r)?l:r;
	
}


}
