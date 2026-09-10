class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        res = 0 
        
        allowed_set = set(list(allowed))
        print(allowed_set)

        for word in words:
            flag = True
            word_list = list(word)
            # print(word_list)
            for char in word_list:
                if char not in allowed_set:
                    flag = False
                    break
                else:
                    continue
            if flag == True:
                res += 1
        print(res)
        return res
        