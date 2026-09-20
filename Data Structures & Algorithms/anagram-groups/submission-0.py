class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        temp_dict = {} 
        for string in strs:
            sorted_str = "".join(sorted(string))
            if sorted_str not in temp_dict:
                temp_dict[sorted_str] = [string]
            else:
                temp_dict[sorted_str].append(string)
        res = [] 
        for key, val in temp_dict.items():
            res.append(val)
        return res
        