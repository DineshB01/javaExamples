package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;
import java.util.*;
public class twonumsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		sc.nextLine();
		int arr[] = new int[] {3,5,-4,8,11,1,-1,6};
		Arrays.sort(arr);
		
	//	for(int z: arr) System.out.print(z+" ");
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[j]+arr[i]==sum) {
				System.out.println(arr[i]+" "+arr[j]);
				break;
			}
			else {
				if(arr[j]+arr[i]<sum) {
					i++;
				}
				else {
					j--;
				}
			}
		}

	}

}
