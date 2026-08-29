class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        res = 0 
        sorted_heights = sorted(heights)
        for i in range(0, len(heights), 1):
            if heights[i] == sorted_heights[i]:
                continue
            else:
                res += 1
        print(res)
        return res
        
        