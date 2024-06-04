class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        int[] occoured = new int[128];
        for (char c : s.toCharArray()) {
            occoured[c]++;
            if (occoured[c] % 2 == 0) {
                count += 2;
            }
        }
        if (count < s.length()) {
            count++;
        }
        return count;
    }
}