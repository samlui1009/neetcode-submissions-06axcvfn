class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        res = [0]*2
        correct_set = set(range(1, len(nums) + 1))
        print(correct_set)
        nums_ctr = Counter(nums)

        for i in range(1, len(nums) + 1, 1):
            if i in nums_ctr and nums_ctr[i] == 1:
                continue
            elif i not in nums_ctr and i in correct_set:
                res[1] = i
            elif i in nums_ctr and nums_ctr[i] > 1:
                res[0] = i
        print(res)            

        # for i in range(1, len(nums), 1):
        #     # This is for the case that it is duplicated
        #     if i in nums_ctr and nums_ctr[i] > 1:
        #         res[0] = i
        #     # This is for the case that it is missing from the counter 
        #     elif i not in nums_ctr and i not in correct_set:
        #         res[1] = i
        # print(res)
        return res