class Solution(object):
    def removeDuplicateLetters(self, s):
        """
        :type s: str
        :rtype: str
        """
        lastOccour = {c: i for i, c in enumerate(s)}
        TempList = []

        for i, c in enumerate(s):
            if c not in TempList:
                while TempList and c < TempList[-1] and i < lastOccour[TempList[-1]]:
                    TempList.pop()
                TempList.append(c)

        return ''.join(TempList)

s= Solution()
print(s.removeDuplicateLetters("bcabc"))
