class Solution:
    def isArraySpecial(self, nums: List[int]) -> bool:
        if len(nums) == 1:
            return True
        
        i = 0
        while i != len(nums) - 1:
            first = nums[i]
            sec = nums[i+1]
            if (first % 2 == 0 and sec % 2 == 0) or (first % 2 == 1 and sec % 2 == 1):
                return False
            i += 1
        return True
            
        