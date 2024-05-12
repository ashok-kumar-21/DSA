import java.util.*;
class Solution {
    public void reverse(int low, int high,int[] arr){
        int temp;
        while(low < high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public void swap(int i, int j, int[] arr){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;
        // finding out the break point
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        System.out.println(breakpoint);
        if(breakpoint == -1){
            reverse(0, n-1, nums);
            return ;
        }
        // swapping the greater number near to breakpoint with the number prsent at breakpoint
        for(int i=n-1; i > breakpoint; i--){
            if(nums[i] > nums[breakpoint]){
                swap(i, breakpoint, nums);
                break;
            }
        }
        System.out.println(nums);
        reverse(breakpoint+1, n-1, nums);
    }
}

//Complexity : O(3N) 
