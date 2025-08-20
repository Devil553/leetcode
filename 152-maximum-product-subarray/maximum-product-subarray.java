class Solution {
    public int maxProduct(int[] nums) {
        int currentmax=nums[0];
        int currentmin=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++){
            int num=nums[i];

            //if num is negative swap max and min
            if(num<0){
                int temp=currentmax;
                currentmax=currentmin;
                currentmin=temp;
            }

             // update current max/min
            currentmax = Math.max(num, currentmax * num);
            currentmin = Math.min(num, currentmin * num);

            // update result
            result = Math.max(result, currentmax);
        }
        return result;
    }
}