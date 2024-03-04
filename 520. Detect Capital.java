class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        if (uppercaseCount == word.length() || uppercaseCount == 0
                || (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0)))) {
            return true;
        }
        return false;
    }
}