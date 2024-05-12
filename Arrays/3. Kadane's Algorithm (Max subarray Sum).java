class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubArraySum = Integer.MIN_VALUE;
        int maxSoFar = 0;
        int start = 0;
        int end = nums.length-1;
        for(int i=0; i<nums.length; i++){
            maxSoFar += nums[i];
            if(maxSoFar > maxSubArraySum){
                maxSubArraySum = maxSoFar;
                end = i;
            }
            if(maxSoFar<0){
                maxSoFar = 0;
                start = i+1;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return maxSubArraySum;
    }
}
