class Solution(object):
    def reverseWords(self, s):
        """
        string = s.split()
        duplicate = []
        returnstring = "\""
        for words in string:
            put = ""
            put += words[::-1]
            duplicate.append(put)
        for revwords in duplicate:
            returnstring += revwords
            returnstring += " "
        returnstring = returnstring.strip()
        returnstring += "\""
        return returnstring
        """
        words = s.split()
        reversedwords = [word[::-1] for word in words]
        return ' '.join(reversedwords)
        

s = Solution()
print(s.reverseWords("Let's take LeetCode contest"))
