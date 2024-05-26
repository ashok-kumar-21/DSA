class Solution {
    public static int totalFruits(int N, int[] fruits) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int l=0; int r=0; int maximumLength = 0;
        while(r<fruits.length){
            if(hs.containsKey(fruits[r])){
                hs.put(fruits[r], hs.get(fruits[r])+1);
            } else{
                hs.put(fruits[r], 1);
            }
            while(hs.size() > 2){
                hs.put(fruits[l], hs.get(fruits[l])-1);
                if(hs.get(fruits[l]) == 0){
                    hs.remove(fruits[l]);
                }
                l++;
            }
            if(hs.size() <= 2)
                maximumLength = Math.max(maximumLength, (r-l+1));
            r++;
        }
        return maximumLength;
    }
}
