class Solution {

    public boolean isPalindrome(int x) {
        String RevStr = "";
        String str = Integer.toString(x);
        char ch[] = str.toCharArray();
        int strlen = str.length();
        for (int i=strlen-1;i >= 0;i--){
            RevStr = RevStr+ch[i];
        }
        if (str.equals(RevStr)){
            return true;
        }
        else {
            return false;
        }
    }
        public static void main(String[] args) {
            Solution sol = new Solution();
            System.out.println(sol.isPalindrome(121));
            System.out.println(sol.isPalindrome(10));

    }
}

