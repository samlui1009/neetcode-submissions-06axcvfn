class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        
        temp={}

        for index,num in enumerate(nums):
            if nums[index] not in temp:
                temp[num] = 1
            else:
                return True

        return False            
                                        
