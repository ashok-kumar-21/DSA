class Solution {
    public int maxScore(int[] nums, int k) {
       int sum = 0;
       for(int i=0; i<k; i++){
        sum += nums[i];
       }
       int r=nums.length-1;
       int ans = sum;
       for(int i=k-1 ; i>=0; i--){
         sum = sum + nums[r--] - nums[i];
         ans = Math.max(ans, sum);
       }
       return ans;
    }
}
