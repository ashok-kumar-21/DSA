class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0; int r=0; int maximumLength=0;
        HashMap<Character, Integer> charIndex = new HashMap<>();
        while(r < s.length()){
            if(charIndex.containsKey(s.charAt(r)) && charIndex.get(s.charAt(r)) >= l){
                l = charIndex.get(s.charAt(r)) + 1;
            } 
            maximumLength = Math.max(maximumLength, (r-l+1));
            charIndex.put(s.charAt(r), r);
            r++;
        }
        return maximumLength;
    }
}
