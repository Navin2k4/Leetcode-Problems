class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        resarr = []
        for i in range(0, len(nums)):
            for j in range(i+1, len(nums)):
                if (nums[i]+nums[j] == target):
                    resarr.append(i)
                    resarr.append(j)
        return resarr

solution = Solution()
result = solution.twoSum([2,7,11,15],9)
print(result)