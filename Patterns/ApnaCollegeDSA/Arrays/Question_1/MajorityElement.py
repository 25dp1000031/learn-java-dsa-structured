class Solution:
    def majorityElement(self, nums):
        map = {}
        for i in nums:
            if map.__contains__(i):
                map[i] += 1
            else:
                map[i] = 1
        max_value = 0
        max_key = 0
        for key,value in map.items():
            if max_value < value:
                max_value = value
                max_key = key
        return max_key
    
sol = Solution()
ans = sol.majorityElement([3,2,3])
print(ans)