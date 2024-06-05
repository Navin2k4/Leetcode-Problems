
#include <stdio.h>
#include <conio.h>

int isMonotonic(int *nums, int numsSize)
{
    // 1-True 0-False
    int increase = 1;
    int decrease = 1;
    for (int i = 0; i < numsSize - 1; i++)
    {
        if (nums[i] > nums[i + 1])
        {
            decrease = 0;
        }
        else if (nums[i] < nums[i + 1])
        {
            increase = 0;
        }
    }
    return increase || decrease;
}

int isMonotonic(int *nums, int numsSize);

int main()
{
    int arr[] = {1, 2, 2, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    if (isMonotonic(arr, size))
    {
        printf("The array is monotonic.\n");
    }
    else
    {
        printf("The array is not monotonic.\n");
    }

    return 0;
}

/*
" In Python "
"""
class Solution(object):
    def isMonotonic(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        increasing = True
        decreasing = True

        for i in range(len(nums) - 1):
            if nums[i] > nums[i + 1]:
                increasing = False
            elif nums[i] < nums[i + 1]:
                decreasing = False

        return increasing or decreasing

s=Solution()
print(s.isMonotonic([1,2,2,3,4]))
"""
*/