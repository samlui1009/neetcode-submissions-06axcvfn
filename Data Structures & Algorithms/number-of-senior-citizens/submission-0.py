class Solution:
    def countSeniors(self, details: List[str]) -> int:
        res = 0
        for string in details:
            spliced = string[11:13]
            spliced_age_int = int(spliced)
            if spliced_age_int > 60:
                res += 1
        print(res)
        return res