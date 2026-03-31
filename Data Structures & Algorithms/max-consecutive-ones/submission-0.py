class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        freqOfOnes = 0 
        totalMaxOccurrences = 0

        for i in range(len(nums)):
            if nums[i] == 1:
                freqOfOnes = freqOfOnes + 1

                # This is partially correct, but requires revision
                currSeenOccurrences = freqOfOnes
                if currSeenOccurrences >= totalMaxOccurrences:
                    totalMaxOccurrences = currSeenOccurrences
            else:
                freqOfOnes = 0                
        
        return totalMaxOccurrences
