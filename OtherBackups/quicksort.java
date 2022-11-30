package javaclasses;
import java.util.*;

public class quicksort {
	static int N;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		N = sc.nextInt();
		arr = new int[N];
		System.out.println("Enter array elements : ");
		for(int i = 0 ;i<N ; i++) {
			arr[i]=sc.nextInt();
		}
		qsort(0,(N-1));
		
		for(int i = 0 ;i<N ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void qsort(int l,int r) {
		if(l<r) {
		int piv = pivot(l,r);
		
		qsort(l,piv-1);
		qsort(piv+1,r);
		}
		
	}
	
	static int pivot(int l,int r) {
		int pivot = arr[r];
		int i=l-1;
		
		for(int k=(i+1);k<r;k++) {
			if(arr[k]<pivot) {
				i++;
				int temp= arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
			for(int z = 0 ;z<N ; z++) {
				System.out.print(arr[z]+", ");
			}
		}
		i++;
		int temp= arr[i];
		arr[i]=arr[r];
		arr[r]=temp;
		
		return i;
		
	}
}
