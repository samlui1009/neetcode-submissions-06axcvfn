# Sliding Window appears to work here
class Solution:
    def largestGoodInteger(self, num: str) -> str:
        # The length of our "substrings" that we need to check
        k = 3 
        n = len(num)
        max_good = "0"
        flag = False
        for i in range(n - k + 1):
            window = num[i:i+k]
            wind_set = set(window)
            if len(wind_set) == 1:
                flag = True
                max_good = max(max_good, next(iter(wind_set)))
            else:
                continue
        # print(max_good)
        if flag == False:
            return ""
        else:
            return str(max_good + max_good + max_good)

