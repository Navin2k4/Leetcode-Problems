class Solution(object):
    def removeDuplicates(self, nums):
        nums[:] = sorted(list(set(nums)))
        return len(nums)

s = Solution()
print(s.removeDuplicates([1,1,2]))