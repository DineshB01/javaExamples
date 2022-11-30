package algorithmsandds;

import java.util.Scanner;

/* Making 6$ from denominations 0,1,2,4
 * 
 * initialize money[i] = {0,1,2,3,4,5,6}
 * 
 * Money$   0  1  2  3  4  5  6 
 * deno($)
 * 0		1  0  0  0  0  0  0 
 * 1		0  1  2  3  4  5  6 
 * 2		0  1  1  2  2  3  3 
 * 4		0  1  1  2  1  2  2 
 * 
 * 
 * At any point money[i] = min(money[i],1+money[i-deno[j]])
 */

public class minNoOfCoinsToMakeChange {

	public static void main(String[] args) {
		System.out.println("Enter the no of demoninations : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] deno = new int[1+n];
		deno[0]=0;
		for(int i =1; i< deno.length ;i++) {
			deno[i]=sc.nextInt();
		}
		System.out.println("Enter the sum to find : ");
		int sum = sc.nextInt();
		
		int[] money = new int[1+sum];
		for(int i =0; i< money.length ;i++) {
			money[i]=i;
		}
		
		for(int i = 1; i<deno.length; i++) {
			for(int j = 1; j < money.length ; j++) {
				if(deno[i]<=j)
				money[j]=min(1+money[j-deno[i]],money[j]);
			}
			System.out.println("Ways = ");
			for(int k =0; k< money.length ;k++) {
				System.out.print(money[k]+" ");
			}
		}
		System.out.println("Ways = ");
		for(int i =0; i< money.length ;i++) {
			System.out.print(money[i]+" ");
		}

	}
	static int min(int a, int b) {
		return a<=b?a:b;
	}

}
