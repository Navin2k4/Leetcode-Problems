class Solution {
    public int integerBreak(int n) {
        if ( n==2 || n==3 ) return (n-1);
        int res = 1;
        while(n>4){
            n -=3 ;
            res *= 3 ;
        }
        return (n*res);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.integerBreak(2));
        System.out.println(sol.integerBreak(10));
        System.out.println(sol.integerBreak(5));
    }

}