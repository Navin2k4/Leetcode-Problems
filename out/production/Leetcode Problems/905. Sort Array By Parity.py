class Solution(object):
    def sortArrayByParity(self, nums):
        nums[:] = [i for i in nums if i % 2 == 0] + \
            [j for j in nums if j % 2 != 0]
        return nums

solution = Solution()
result = solution.sortArrayByParity([3,1,2,4])
print(result)
