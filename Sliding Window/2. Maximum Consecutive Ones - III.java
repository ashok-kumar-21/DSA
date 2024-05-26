class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0; int r=0; int maximumConsecutiveOnes = 0;
        int zeroes = 0;
        while(r<nums.length){
            if(nums[r] == 0){
                zeroes +=1;
            }
            while(zeroes > k){
                if(nums[l] == 0)
                    zeroes -= 1;
                l++;
            }
            maximumConsecutiveOnes = Math.max(maximumConsecutiveOnes, (r-l+1));
            r++;
        }
        return maximumConsecutiveOnes;
    }
}
