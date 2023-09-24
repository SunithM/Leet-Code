package challenges;

import java.util.HashSet;
import java.util.Set;

class JwelStone {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int ans = 0;
        for(int i=0; i<stones.length(); i++) {
            if(set.contains(stones.charAt(i))) ans++;
        }
        return ans;
    }
    public static void main(String args[]) {
    	System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}