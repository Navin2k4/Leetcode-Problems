import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for (char currentChar = 'a'; currentChar <= 'z'; currentChar++) {
            int minFrequency = Integer.MAX_VALUE;
            for (String word : words) {
                int charCount = 0;
                for (char ch : word.toCharArray()) {
                    if (ch == currentChar) {
                        charCount++;
                    }
                }
                minFrequency = Math.min(minFrequency, charCount);
            }
            for (int i = 0; i < minFrequency; i++) {
                result.add(currentChar + "");
            }
        }
        return result;
    }
}
