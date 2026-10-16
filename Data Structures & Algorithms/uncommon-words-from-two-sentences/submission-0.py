class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        s1_map = Counter(s1.split())
        s2_map = Counter(s2.split())

        res = []

        for key, val in s1_map.items():
            # If the word is in both maps, then it is NOT uncommon - Ignore
            if key in s2_map:
                continue 
            # If the word is only in 1 map and the val is 1, then it IS uncommon
            elif key not in s2_map and val == 1:
                res.append(key)
        
        for key, val in s2_map.items():
            if key in s1_map:
                continue
            elif key not in s1_map and val == 1:
                res.append(key)
        
        return res