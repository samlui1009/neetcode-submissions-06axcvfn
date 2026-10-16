class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        z_ptr = 0 
        o_ptr = 1
        while o_ptr < len(nums):
            if nums[z_ptr] == nums[o_ptr]:
                nums[z_ptr] = nums[z_ptr] * 2
                nums[o_ptr] = 0
            z_ptr += 1
            o_ptr += 1

        count = 0  # Pointer for the next non-zero element position
    
        for i in range(len(nums)):
            if nums[i] != 0:
                # Swap elements
                nums[count], nums[i] = nums[i], nums[count]
                count += 1
        # print(nums)
        return nums