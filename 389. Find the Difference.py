class Solution(object):
    def findTheDifference(self, s, t):
        char_count = {}
        excess_chars = ""
        for ch in t:
            char_count[ch] = char_count.get(ch, 0) + 1

        for ch in char_count:
            if char_count[ch] > s.count(ch):
                excess_chars += ch

        return excess_chars

        """
        :type s: str
        :type t: str
        :rtype: str
        """

solution = Solution()
result = solution.findTheDifference("abcd","abcde")
print(result)