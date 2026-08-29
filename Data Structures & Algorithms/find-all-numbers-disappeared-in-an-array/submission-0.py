class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums)
        temp_set = set(range(1, n+1))
        for num in nums:
            if num in temp_set:
                temp_set.discard(num)
        return list(temp_set) 

        