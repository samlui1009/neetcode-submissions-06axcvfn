class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        
        res = 0 
        g_ptr = 0 
        s_ptr = 0 

        while s_ptr < len(s) and g_ptr < len(g):
            if s[s_ptr] >= g[g_ptr]:
                res += 1
                g_ptr += 1
                s_ptr += 1
            else:
                s_ptr += 1

        return res