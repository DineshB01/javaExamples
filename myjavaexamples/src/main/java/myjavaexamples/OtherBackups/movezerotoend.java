package myjavaexamples.src.main.java.myjavaexamples.OtherBackups;

public class movezerotoend {

}

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int flag=-1;
        int i=0;int j=nums.length;
        while(i<j){
            if(nums[i]==0&&flag==-1){
                flag=i;
                i++;
                continue;
            }
            else{
                if(nums[i]!=0&&flag>-1){
                    nums[flag]=nums[i];
                    nums[i]=0;
                    i=flag+1;
                    flag=-1;
                    continue;
                }
            }
            i++;
        }
        
        
    }
}
