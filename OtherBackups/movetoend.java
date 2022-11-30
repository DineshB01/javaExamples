package algorithmsandds;

public class movetoend {

	public static void main(String[] args) {
		int[] arr= new int[] {2,1,2,2,2,3,4,2};
		int i = arr.length-1;
		int j=i;
		int num=2;
		arrSort(arr);
		while(i>=0) {
			if(arr[i]==num) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i--;
				j--;
				continue;
			}
			i--;
			
		}
		for(int z: arr) System.out.print(z+" ");

	}
	
	static void arrSort(int[] arr) {
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]!=2) {
				int temp= arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
			i++;
		}
		for(int z: arr) System.out.print(z+" ");
		System.out.println();
	}

}
