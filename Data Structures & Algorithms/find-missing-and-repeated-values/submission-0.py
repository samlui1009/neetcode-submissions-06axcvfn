class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        total_elements = len(grid)**2
        temp_dict = {}

        rows = len(grid)
        cols = len(grid[0])

        res = [0]*2

        for i in range(rows):
            for j in range(cols):
                if grid[i][j] not in temp_dict:
                    temp_dict[grid[i][j]] = 1
                else:
                    temp_dict[grid[i][j]] += 1

        for i in range(1, total_elements + 1, 1):
            if i in temp_dict and temp_dict[i] > 1:
                res[0] = i
            elif i not in temp_dict:
                res[1] = i
        return res
        