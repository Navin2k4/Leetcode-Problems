// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int accounts[][] = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        System.out.println(sol.maximumWealth(accounts));
    }
}