class Solution:
    def arraySign(self, nums: List[int]) -> int:
        product = 1 
        for num in nums:
            product = product*num 
        if product < 0:
            return -1 
        if product > 0:
            return 1 
        return 0
        