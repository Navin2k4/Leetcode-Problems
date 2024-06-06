import java.util.Arrays;

class Solution {
       public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        int[] occoured = new int[n]; 
        for (int i = 0; i < n; i++) {
            if (occoured[i] == 1) {
                continue;
            }
            int min = hand[i];
            boolean result = findAndAdd(hand, min, occoured, groupSize);
            if (!result) {
                return false;
            }
        }
        return true;
    }
    boolean findAndAdd(int[] hand, int min, int[] occoured, int groupSize) {
        int count = 0;
        for (int i = 0; i < hand.length; i++) {
            if (count == groupSize) {
                break;
            }
            if (occoured[i] == 0 && hand[i] == min) {
                occoured[i] = 1;
                min++;
                count++;
            }
        }
        return count == groupSize;
    }
}