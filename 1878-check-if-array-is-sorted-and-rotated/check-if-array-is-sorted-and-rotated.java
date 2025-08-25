class Solution {
    public boolean check(int[] nums) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
          if (count > 1) {
                    return false; // More than 1 break in order → not sorted/rotated
                }
            }
        }
        
        return true; // At most 1 break → valid rotated sorted array
    }
}