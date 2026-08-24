class Solution:
    def findLucky(self, arr: List[int]) -> int:
        temp_dict = {}
        for num in arr:
            if num not in temp_dict:
                temp_dict[num] = 1
            else:
                temp_dict[num] += 1
        
        updatedMax = 0
        currMax = 0
        for key, val in temp_dict.items():
            if key == val:
                if key > currMax:
                    currMax = key
                    updatedMax = currMax
        if updatedMax != 0:
            return updatedMax
        return -1        