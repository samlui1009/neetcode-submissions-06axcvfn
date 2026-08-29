class Solution:
    def firstUniqChar(self, s: str) -> int:
        # Edge case that exists
        if len(s) == 1:
            return 0 
        temp_dict = {}
        for char in s:
            if char not in temp_dict:
                temp_dict[char] = 1
            else:
                temp_dict[char] += 1
        
        for char in s:
            if temp_dict[char] == 1:
                res = s.find(char)
                return res
        return -1
        
        