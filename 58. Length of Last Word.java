class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int letterCount = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            letterCount++;
            i--;
        }
        return letterCount;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.lengthOfLastWord("Hello welcome to the moon");
    }
}