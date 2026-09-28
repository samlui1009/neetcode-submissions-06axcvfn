class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        sorted_nums = sorted(nums) 
        first_pair = sorted_nums[0]*sorted_nums[1]
        second_pair = sorted_nums[-1]*sorted_nums[-2]
        return second_pair - first_pair
        