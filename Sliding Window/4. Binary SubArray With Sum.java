class Solution {
    public int countOfSubArraysLessThanGoal(int[] nums, int goal){
        int l=0; int r=0; int count = 0; int sum=0;
        while(r<nums.length){
            if(goal<0){
                return 0;
            }
            sum+=nums[r];
            while(sum>goal){
                sum -= nums[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count1 =  countOfSubArraysLessThanGoal(nums, goal);
        int count2 =  countOfSubArraysLessThanGoal(nums, goal-1);
        return  count1 - count2;
    }
}
