package algorithmsandds;
import java.util.*;

public class singleCycleCheck {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the arr size : ");
	int size = sc.nextInt();
	int[] arr = new int[size];
	int[] vis = new int[size];
	System.out.println("Enter arr elements : ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter start index : ");
	int sI = sc.nextInt(); //startIndex
	sc.nextLine();
	
	while(size!=0) {
		
		vis[sI]=1;
		sI = sI + arr[sI];
		
		if(sI>arr.length-1) {
			sI=sI%arr.length;
			
		}
		if(sI<0) {
			sI=sI%arr.length;
			sI=arr.length+sI;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(vis[i]+" ");
		}
		System.out.println();
		size--;
	}
	
	sc.close();
	
}
}
