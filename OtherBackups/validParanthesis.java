package javaclasses;

import java.util.Scanner;

/* {[{}{}]}[()], {{}{}}, []{}() are balanced expressions.
 
{()}[), {(}) are not balanced.

    Practice this problem

We can use a stack to solve this problem. The idea is to traverse the given expression, and

    If the current character in the expression is an opening brace ( or { or [, push it into the stack.
    If the current character in the expression is a closing brace ) or } or ], pop a character from the stack, and return false if the popped character is not the same as the current character, or it does not pair with the current character of the expression. Also, if the stack is empty, the total number of opening braces is less than the closing brace number at that point, so the expression cannot be balanced.
*/
public class validParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int[] arr1=new int[arr.length];
		
		int j=0,k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='{'||arr[i]=='('||arr[i]=='[') {
				
				if(j<0) {System.out.println("false"+j); break;}
				
				arr1[j]=1;
				j++;
				for(int z=0;z<arr.length;z++)
					System.out.print(arr1[z]+" ");
					System.out.println();
				
			}
			else
			if(arr[i]=='}'||arr[i]==')'||arr[i]==']') {
				j--;if(j<0) {System.out.println("false"+j); break;}
				if(arr1[j]==1) {
					arr1[j]=0;
					
					
					
					for(int z=0;z<arr.length;z++)
					System.out.print(arr1[z]+" ");
					System.out.println();
					
				}
				
			}
			
		}
		
	}
}
