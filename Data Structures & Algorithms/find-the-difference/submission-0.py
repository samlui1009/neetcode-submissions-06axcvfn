class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        t_dict = {}
        for char in t:
            if char not in t_dict:
                t_dict[char] = 1
            else:
                t_dict[char] += 1
        
        for char in s:
            if char in t_dict:
                t_dict[char] -= 1 
        
        for key, val in t_dict.items():
            if t_dict[key] > 0:
                return key
        
        