class Solution(object):
    def decodeAtIndex(self, s, k):

        total_len = 0
        tape_len = 0

        for char in s:
            if char.isnumeric():
                tape_len *= int(char)
            else:
                tape_len += 1
                total_len += tape_len

        for char in reversed(s):
            if char.isnumeric():
                tape_len /= int(char)
                k %= tape_len
            else:
                if k == 0 or k == tape_len:
                    return char
                tape_len -= 1


solution = Solution()
s = "leet2code3"
k = 10
result = solution.decodeAtIndex(s,k)
print(result)
