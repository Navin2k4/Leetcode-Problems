import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) { 
        int val1=0,val2=0,val1count=0,val2count=0;
        for(int num :nums){
            if(val1==num) val1count++;
            else if (val2==num) val2count++;
            else if(val1count==0){
                val1 = num;
                val1count=1;
            }
            else if(val2count==0){
                val2 = num;
                val2count=1;
            }
            else{
                val1count--;
                val2count--;
            }
        } 
            val1count = val2count =0;
            for(int num : nums){
                if(num==val1) val1count++;
                else if(num==val2) val2count++;
            }
            List <Integer> ans = new ArrayList<>();
            if(val1count > nums.length/3) ans.add(val1);
            if(val2count > nums.length/3) ans.add(val2);
            return ans;
        }
public static void main(String[] args) {
    Solution solution = new Solution();
    int[] testArray = {3, 2, 3}; 
    System.out.println(solution.majorityElement(testArray)); // Output will be [3]
}

}

