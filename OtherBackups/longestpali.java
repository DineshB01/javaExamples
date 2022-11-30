package algorithmsandds;

import java.util.Scanner;

public class longestpali {
	static int[] res=new int[2];
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char[] arr=sc.nextLine().toCharArray();
	
	for(int i=0;i<arr.length;i++) {
		isPali(arr,i,i);
		if(i+1<arr.length);
		isPali(arr,i,i+1);
		
	}
	
	for(int i=res[0];i<=res[1];i++)System.out.println(arr[i]);
}

static void isPali(char[] arr,int l,int r) {
	while(l>=0&&r<arr.length&&arr[l]==arr[r]) {
		l--;
		r++;
	}
	if(r-l>res[1]-res[0]) {
		res[0]=l+1;
		res[1]=r-1;
	}
}
}
