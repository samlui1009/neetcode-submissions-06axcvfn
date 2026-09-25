class Solution:
    def scoreOfString(self, s: str) -> int:
        score = 0
        temp_dict = {}
        for char in s:
            temp_dict[char] = ord(char)
        # print(temp_dict)
        for i in range(len(s)-1):
            if i == len(s)-1:
                return score
            currScore = abs(temp_dict[s[i]] - temp_dict[s[i+1]])
            score = score + currScore
        return score

        