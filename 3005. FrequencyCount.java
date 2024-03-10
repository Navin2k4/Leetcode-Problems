class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFrequency = 0;
        for (int i = 0; i < nums.length; i++) {
            int frequency = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        int countMaxFrequency = 0;
        for (int num : nums) {
            if (countFrequency(nums, num) == maxFrequency) {
                countMaxFrequency++;
            }
        }

        return countMaxFrequency;
    }

    static int countFrequency(int[] nums, int num) {
        int count = 0;
        for (int value : nums) {
            if (value == num) {
                count++; // Count occurrences of num in nums
            }
        }
        return count;
    }
}