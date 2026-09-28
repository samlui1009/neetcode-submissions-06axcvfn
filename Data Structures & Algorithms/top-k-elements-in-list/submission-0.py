class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if len(nums) == 1:
            return [nums[0]]

        temp_dict = {}
        for num in nums:
            if num not in temp_dict:
                temp_dict[num] = 1
            else:
                temp_dict[num] += 1

        pairs = []
        res = []

        for key, val in temp_dict.items():
            pairs.append((val, key))

        pairs.sort(reverse = True)

        for i in range(0, k, 1):
            res.append(pairs[i][1])

        return res