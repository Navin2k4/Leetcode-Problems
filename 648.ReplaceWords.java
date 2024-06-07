import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] dict = dictionary.toArray(new String[0]);
        Arrays.sort(dict, Comparator.comparingInt(String::length)); //3ms
        sortDictionaryByLength(dict); // 5ms
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String replacement = word;
            for (String dictWord : dict) {
                if (word.startsWith(dictWord)) {
                    replacement = dictWord;
                    break;
                }
            }
            result.append(replacement).append(" ");
        }
        return result.toString().trim();
    }
    private void sortDictionaryByLength(String[] dict) {
        int n = dict.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dict[j].length() > dict[j + 1].length()) {
                    String temp = dict[j];
                    dict[j] = dict[j + 1];
                    dict[j + 1] = temp;
                }
            }
        }
    }
}
