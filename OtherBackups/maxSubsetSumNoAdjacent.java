package algorithmsandds;

public class maxSubsetSumNoAdjacent {

	public static void main(String[] args) {
		int[] arr = new int[] {7,10,12,7,9,14};
		for(int i=2;i<arr.length;i++) {
			if(arr[i-1]>(arr[i-2]+arr[i])) arr[i]=arr[i-1];
			else arr[i]+=arr[i-2];
		}
		System.out.println(arr[arr.length-1]);
	}

}
