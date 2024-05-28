class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash = {-1, -1, -1};
        int r=0;
        int count = 0;
        while(r<s.length()){
            hash[s.charAt(r) - 'a'] = r;
            if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1){
                count = count + (1 + Math.min(Math.min(hash[0], hash[1]), hash[2]));   
            }
            r++;
        }
        return count;
    }
}
