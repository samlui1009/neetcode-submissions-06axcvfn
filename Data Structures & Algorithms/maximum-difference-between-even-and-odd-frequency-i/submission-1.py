class Solution:
    def maxDifference(self, s: str) -> int:
        temp_dict = {}
        for char in s:
            if char not in temp_dict:
                temp_dict[char] = 1
            else:
                temp_dict[char] += 1

        freqA1 = 0 
        freqA2 = float('inf') 

        currFreqA1 = 0 
        currFreqA2 = 0
        for val in temp_dict.values():
            if val % 2 == 1:
                currFreqA1 = val
                if currFreqA1 > freqA1:
                    freqA1 = currFreqA1
            elif val % 2 == 0:
                currFreqA2 = val
                if currFreqA2 < freqA2:
                    freqA2 = currFreqA2
        return freqA1 - freqA2
        