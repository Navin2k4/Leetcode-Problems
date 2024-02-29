// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        return digits(num) % 2 == 0;
    }
    static int digits(int num){
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)+1);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 12, 345, 2, 6, 7896 };
        int evenCount = sol.findNumbers(nums);
        System.out.println(evenCount);
    }
}