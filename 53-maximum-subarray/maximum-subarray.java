class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxCurrent =0;


        for(int i=0;i<nums.length;i++){
            maxCurrent=maxCurrent+nums[i];
            if(maxSum<maxCurrent){
                maxSum=maxCurrent;
            }
            if(maxCurrent<0){
                maxCurrent=0;
            }
        }
        return maxSum;
    }
}