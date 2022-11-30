package javaclasses;
import java.util.*;
public class printx {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter str : ");
	String str= sc.nextLine();
	int len = str.length();

	for(int i=0; i<str.length(); i++) {
		int k = str.length()-1-i;
		for(int j=0;j<str.length();j++) {
			if(j==i||j==k) {
				System.out.print(str.charAt(j));
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	

}
}
