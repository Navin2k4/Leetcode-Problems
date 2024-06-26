class Solution {
     public int appendCharacters(String s, String t) {
        if(s.equals(t)) return 0;
        return t.length() - findFirstChange(s,t);
    }
    int findFirstChange(String s, String t){
        int i=0;
        int j=0;
        while (i < s.length() && j< t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return j;
    }
} 
