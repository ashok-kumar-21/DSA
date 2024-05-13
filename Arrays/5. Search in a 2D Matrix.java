class Solution {
    void binarSearch(int low, int high){

    }
    public boolean searchMatrix(int[][] a, int target) {
        int m = a.length;
        int n = a[0].length;
        int low = 0;
        int high = m*n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid/n][mid%n] == target){
                return true;
            } else if(a[mid/n][mid%n] > target){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return false;
    }
}
