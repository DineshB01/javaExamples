package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;
import java.util.*;

public class merge2arrays {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[] arr1 = new int[] {2,4,5,6,7,9,10,13,32,33,41,222,1111};
		int[] arr2 = new int[] {2,3,4,5,6,7,8,9,11,15};
		int[] temp = arr1;
		arr1=arr2;
		arr2=temp;
		int[] res = new int[arr1.length+arr2.length];
		
		int j=0,k=0;
		for(int i=0;i<res.length;) {
			
			if(j<arr1.length&&arr1[j]<=arr2[k]) {
				res[i]=arr1[j];
				j++;
				i++;
			}
			
			else {
				if(k<arr2.length) {
				
					res[i]=arr2[k];
			
				k++;
				i++;
				}
			}
			
		}
		
		for(int out : res) {
			System.out.print(out+" ");
		}
	
	}	

}
