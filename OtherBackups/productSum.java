package javaclasses;

import java.util.Scanner;

public class productSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int sum=0,flag=1;
	System.out.println(sum);
	for(int i=1;i<str.length();i++) {
		if(str.charAt(i)=='[') {
			flag++;
			
		}
		if(str.charAt(i)==']') {
			flag--;
			
		}
		if(str.charAt(i)==',') continue;
		if(str.charAt(i)=='-') {flag=flag*-1;i++;}
		int t=Character.getNumericValue(str.charAt(i));
		sum=sum+(t*flag);
		if(flag<0)flag*=-1;
		
	}
	System.out.println(sum);
}
}
