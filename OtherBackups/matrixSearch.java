package javaclasses;
import java.util.*;
public class matrixSearch {

static boolean recur(char[][] arr,int i,int j,String str)	{
	try {
		for(int z=0;z<str.length();z++) {
			if(str.charAt(z)!=arr[i][j++]) {
				return false;
			}
		}
		return true;
	}
	catch(Exception e) {
		return false;
	}
	
}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter matrix size");
	int size = sc.nextInt();
	char[][] arr = new char[size][size];
	//String str1 = sc.nextLine();

	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]= sc.next().charAt(0);
			
		}
	}
	boolean flag=true;
	sc.nextLine();
	System.out.println("Enter string to search");
	String str = sc.nextLine();
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			if(arr[i][j]==str.charAt(0)) {
				boolean isTrue = recur(arr,i,j,str);
			}
		}
	}	
	
	/*while(flag) {
		System.out.println("Enter string to search");
		String str = sc.nextLine();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[i][j]==str.charAt(0)) {
					//right side
					if(arr[0].length-j>=str.length()) {
						existRL(arr,i,j,str,1);
					}
					//left
					if(j>=str.length()) {
						existRL(arr,i,j,str,-1);
					}
					//down
					if(arr.length-i>=str.length()) {
						existUD(arr,i,j,str,1);
					}
					//up
					if(i>=str.length()) {
						existUD(arr,i,j,str,-1);
					}
				}
			}
		}
		
	}*/
	
	
	
}
static void existRL(char[][] arr,int i,int j,String str,int f) {
	for(int z=0;z<str.length();z++) {
		if(arr[i][j]==str.charAt(z)) {j+=f;continue;}
		else break;
	}
	if(f==1)
	System.out.println("from"+i+" "+(j-str.length())+"to"+i+" "+j);
	else
		System.out.println("from"+i+" "+(j+str.length())+"to"+i+" "+j);
}
static void existUD(char[][] arr,int i,int j,String str,int f) {
	
}
}
