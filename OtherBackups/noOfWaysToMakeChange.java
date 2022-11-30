package algorithmsandds;

import java.util.Scanner;

/* Making 11$ from denominations 0,1,5,10,25
 * 
 * intitialize money[0]=1;
 * 
 * Money$   0  1  2  3  4  5  6  7  8  9  10  11
 * deno($)
 * 0		1  0  0  0  0  0  0  0  0  0   0   0
 * 1		1  1  1  1  1  1  1  1  1  1   1   1
 * 5		1  1  1  1  1  2  2  2  2  2   3   3
 * 10		1  1  1  1  1  2  2  2  2  2   4   4
 * 25		1  1  1  1  1  2  2  2  2  2   4   4
 * 
 * At any point money[i] = money[i]+money[i-deno[j]]
 */

public class noOfWaysToMakeChange {
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
		money[0] = 1;
		
		for(int i = 1; i<deno.length; i++) {
			for(int j = 1; j < money.length ; j++) {
				if(deno[i]<=j)
				money[j]+=money[j-deno[i]];
			}
		}
		System.out.println("Ways = ");
		for(int i =0; i< money.length ;i++) {
			System.out.print(money[i]+" ");
		}
		
	}
}
