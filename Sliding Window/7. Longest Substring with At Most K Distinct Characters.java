class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int l =0;
        int r = 0;
        int maxLength = -1;
        HashMap<Character, Integer> mp = new HashMap<>();
        while(r<s.length()){
            if(mp.containsKey(s.charAt(r))){
                mp.put(s.charAt(r), mp.get(s.charAt(r)) + 1);
            } else {
                mp.put(s.charAt(r), 1);
            }
            if(mp.size() > k){
                mp.put(s.charAt(l), mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l)) ==0)
                    mp.remove(s.charAt(l));
                l++;
            }
            if(mp.size() == k){
               maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }
        return maxLength;
    }
}
