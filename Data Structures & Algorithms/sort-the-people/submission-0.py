class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        temp_dict = {} 
        for name, height in zip(names, heights):
            temp_dict[height] = name
        
        res = []
        for height in reversed(sorted(heights)):
            res.append(temp_dict[height])
        return res
            
        