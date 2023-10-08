class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        i=0
        while(i<len(nums)):
            if nums[i]==target or nums[i]>target:
                return i
            i+=1
        return i
        
sol = Solution()
print(sol.searchInsert([1,3,5,7],5))
print(sol.searchInsert([1,3,5,7],2))
print(sol.searchInsert([1,3,5,6],7))