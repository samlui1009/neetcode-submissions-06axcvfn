class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        temp_dict = {} 
        for char in magazine:
            if char not in temp_dict:
                temp_dict[char] = 1
            else:
                temp_dict[char] += 1
        
        for char in ransomNote:
            if char not in temp_dict:
                return False
            elif char in temp_dict and temp_dict[char] == 0:
                return False
            elif char in temp_dict and temp_dict[char] > 0:
                temp_dict[char] -= 1
        return True
        