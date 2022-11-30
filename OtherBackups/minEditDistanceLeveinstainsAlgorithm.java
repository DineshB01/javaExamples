package algorithmsandds;

import java.util.Scanner;

/* Insertion, Updation, Deletion
 * 
 * Convert string yabd - > abc
 * 
 * remove y +1 operation
 * substitute d with c +1 operation
 * total = 2 operation
 * 						     {"",y,a,b,d}
 * initialize arr[i][j] = "" {0, 1,2,3,4}
 * 						  a  {1, 0,0,0,0}
 * 						  b  {2, 0,0,0,0}
 * 						  c  {3, 0,0,0,0}
 * 						 
 * 						     {"",y,a,b,d}
 * final	 arr[i][j]  = "" {0, 1,2,3,4}
 * 						  a  {1, 1,1,2,3}
 * 						  b  {2, 2,2,1,2}
 * 						  c  {3, 3,3,2,2}
 * 						 
 * 
 *
 * start index loop i,j with 1,1
 *
 *if(two characters are not equal)
 * At any point arr[i][j] = 1+min(arr[i-1][j],arr[i][j-1],arr[i-1][j-1])
 * if(equal)
 * arr[i][j]=arr[i-1][j-1];
 */
public class minEditDistanceLeveinstainsAlgorithm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the initial string :");
	String initial = sc.nextLine();
	String finals = sc.nextLine();
	int[][] arr = new int[finals.length()+1][initial.length()+1];
	
	for(int i =0;i<initial.length();i++) arr[0][i]=i;
	for(int i =0;i<finals.length();i++) arr[i][0]=i;
	
	print(arr);
	
	for(int i=1;i<arr.length;i++) {
		
		for(int j=1;j<arr[0].length;j++) {
			if(initial.charAt(j-1)==finals.charAt(i-1)) {
				arr[i][j]=arr[i-1][j-1];
			}
			else
				arr[i][j] = 1+minimum(arr[i-1][j],arr[i][j-1],arr[i-1][j-1]);
			
		}
		System.out.println();
	}
	print(arr);
}
static int minimum(int a,int b, int c) {
	if(a<=b&&a<=c) return a;
	else
		if(b<=a&&b<=c) return c;
		else
			if(c<=a&&c<=b) return c;
	return 1;
}
static void print(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
