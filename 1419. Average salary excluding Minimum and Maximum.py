class Solution(object):
    def average(self, salary):
        salary.sort()
        length = len(salary)
        salary.pop(0)
        salary.pop(length-2)
        tot = 0.0
        count = 0.0
        for i in salary:
            tot += i
            count += 1
        avg = float(tot/count)
        return avg
        """
        :type salary: List[int]
        :rtype: float
        """

sol = Solution()
result = sol.average([4000,3000,1000,2000])
print(result)