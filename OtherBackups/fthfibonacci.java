package algorithmsandds;

import java.util.Scanner;

public class fthfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		int j =1;
		int k =2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int ind = sc.nextInt();sc.nextLine();
		System.out.println(" "+j+" ");
		while(k<=ind) {
			
			k++;
			int temp = j;
			j=j+i;
			i=temp;
			System.out.println(" "+j+" ");
			
		}
		System.out.println(j);

	}

}
