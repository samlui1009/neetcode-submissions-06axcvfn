class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Immediate False return - If 's' and 't' do not match in terms of 
        # their character count
        if len(s) != len(t):
            return False
        
        s_dict = {}

        # Set up the character-based dictionary for 's'
        for char in s:
            if char not in s_dict:
                s_dict[char] = 1
            else:
                s_dict[char] += 1
        
        for char in t:
            if char not in s_dict:
                return False
            elif char in s_dict and s_dict[char] == 0:
                return False
            elif char in s_dict and s_dict[char] > 0:
                s_dict[char] -= 1
        
        return True
        

        