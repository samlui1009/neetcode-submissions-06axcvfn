class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        sorted_nums = sorted(nums)
        # print(sorted_nums)
        # seen = set()
        for i in range(0, len(nums)-1, 2):
            if sorted_nums[i] != sorted_nums[i+1]:
                return False
        return True
        