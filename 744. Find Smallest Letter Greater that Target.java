class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length]; // ! Statement Changed from ( return -1 ) to ( return start ) the Normal Binary search

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        char array[] = { 'c', 'f', 'j' };
        char ans = sol.nextGreatestLetter(array, 'a');
        System.out.println(ans);        
    }

}