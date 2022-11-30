package algorithmsandds;

// not done
public class productSum1 {
	public static void main(String[] args) {
		
	int[] arr1 = new int[] {5,2,7,-1,3,6,-13,8,4};
	int[] arr2 = new int[] {1,1,2,2,1,2,3,3,2};
	int finalSum=0;
	int curSum=0;
	for(int i=1;i<arr1.length;i++) {
		if(arr2[i]!=arr2[i-1]) {
			finalSum+=arr1[i-1]*arr2[i-1];
		}
		else
			arr1[i]+=arr1[i-1];
	}
	
	System.out.println(finalSum);
		
	}
}
