package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		//List<List<Integer>> lis= new ArrayList<>();
		
		System.out.println("Enter the string : ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println("false");
				break;
			}
			i++;
			j--;
		}
		if(i==j||i>j) System.out.println("true");

	}

}
