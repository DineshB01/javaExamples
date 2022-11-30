package algorithmsandds;

import java.util.Scanner;

public class subArraSortIndex {
	static int[] arr;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size : ");
	int N=sc.nextInt();
	arr=new int[N];
	System.out.println("Enter array elements : ");
	for(int i=0;i<N;i++) {
		arr[i]=sc.nextInt();
	}
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<N;i++) {		
		if((i-1>=0&&arr[i-1]>arr[i])||(i+1<N&&arr[i+1]<arr[i])) {
			min=(arr[i]<min)?arr[i]:min;
			max=(arr[i]>max)?arr[i]:max;
		}
	}
	System.out.println(min+" "+max);
	int l=0,r=0;
	for(int i=0;i<N;i++) {
		if(min<arr[i]) {
			l=i;
			System.out.println("i min"+i);break;
		}
	}
	for(int i=N-1;i>0;i--) {
		if(max>arr[i]) {
			r=i;
			System.out.println("i max"+i);break;
		}
	}
	qsort(l,r);
	for(int a : arr) System.out.println(a);
	
	
	
}

static void qsort(int l,int r) {
	if(l<r) {
		int m=pivot(l,r);
		qsort(l,m-1);
		qsort(m+1,r);	
	}
	
	
}

static int pivot(int l,int r) {
	int pivot=arr[l];
	int res=0;
	while(l<r) {
		if(arr[l]==pivot&&arr[l]>arr[r]) {
			arr[l]=arr[r];
			arr[r]=pivot;
			res=r;
			l++;
			
		}else {
			arr[r]=arr[l];
			arr[l]=pivot;
			res=l;
			r--;
			
		}
	}
	
	return res;
	
}
}
