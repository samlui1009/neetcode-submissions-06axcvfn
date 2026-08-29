class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        # Uses too much space ;_;
        temp_set = set() 
        for word in arr:
            temp_set.add(word)
        if len(temp_set) < k:
            return ""
        
        temp_dict = {} 
        for word in arr:
            if word not in temp_dict:
                temp_dict[word] = 1 
            else:
                temp_dict[word] += 1

        for word in arr:
            if temp_dict[word] > 1:
                continue 
            elif temp_dict[word] == 1:
                k -= 1
                if k == 0:
                    return word
        return ""        