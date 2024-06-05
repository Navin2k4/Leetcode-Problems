class Solution(object):
    def find132pattern(self, nums):
        n = len(nums)
        stack = []
        min_array = [nums[0]]

        for i in range(1, n):
            min_array.append(min(min_array[-1], nums[i]))

        for j in range(n-1, -1, -1):
            if nums[j] > min_array[j]:
                while stack and stack[-1] <= min_array[j]:
                    stack.pop()
                if stack and stack[-1] < nums[j]:
                    return True
                stack.append(nums[j])

        return False

        """
        :type nums: List[int]
        :rtype: bool
        """

s = Solution()
print(s.find132pattern([3,5,0,3,4]))
print(s.find132pattern([-1,3,2,0]))
print(s.find132pattern([1, 2, 3, 4]))
