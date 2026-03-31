class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        
        # What we hope to return
        results = 0 

        for char in s[::-1]:
            if char == " " and results == 0:
                continue
            elif char == " ":
                break
            else:
                results += 1
        
        return results

        
        