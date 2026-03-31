class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        # Instantiate a new List that we should be returning
        results = []

        # Instantiate a temporary dictionary that should be storing
        # the index and its associated value in the nums list
        temp = {}

        # Use a for loop to loop through the index and its associated value, num,
        # adding it into the temporary dictionary variable
        for index, num in enumerate(nums):
            complement = target - num
            if complement in temp:
                return [temp[complement], index]
            temp[num]=index
        
        return results

        