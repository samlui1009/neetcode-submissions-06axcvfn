class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        # Edge case
        if len(words) == 0:
            return ""

        res = ""
        for word in words:
            # Set up the left and right pointers
            l = 0 
            r = len(word) - 1 
            flag = True
            while l < r:
                if word[l] == word[r]:
                    l += 1
                    r -= 1
                elif word[l] != word[r]:
                    flag = False
                    break
            if flag == True:
                res = word
                break
        return res            