package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;

import java.util.Scanner;

public class stringandnum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str= sc.nextLine();
	for(int i=1;i<str.length();i++) {
		for(int j=0;j<(str.charAt(i)-'0');j++)System.out.print(str.charAt(i-1));
	}
}
}
