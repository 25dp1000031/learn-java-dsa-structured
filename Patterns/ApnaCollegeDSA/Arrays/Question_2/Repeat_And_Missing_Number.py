class Solution:
    def findMissingAndRepeatedValues(self, grid):
        map = {}
        largest_number = len(grid) * len(grid)
        x = 0
        for i in range(1,largest_number + 1):
            x ^= i 
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] in map:
                    map[grid[i][j]] += 1
                else:
                    map[grid[i][j]] = 1
                x ^= grid[i][j]
        
        max_value = 0
        for key,value in map.items():
            if value >= 2:
                duplicate = value
                ans_key = key
        ans_duplicate = ans_key
        ans_missing = x ^ ans_duplicate
        return [ans_duplicate, ans_missing]
    
sol = Solution()
grid = [[1,3],[2,2]]
# grid = [[[9,1,7],[8,9,2],[3,4,6]]] 
ans = sol.findMissingAndRepeatedValues(grid)
print(ans)