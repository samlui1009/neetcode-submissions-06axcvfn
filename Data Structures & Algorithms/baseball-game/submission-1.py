class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = deque()

        for char in list(operations):
            if char == '+':
                new_score = stack[-2] + stack[-1]
                stack.append(new_score)
            elif char == 'D':
                new_score = stack[-1]*2
                stack.append(new_score)
            elif char == 'C' and len(stack) > 0:
                stack.pop()
            else:
                int_score = int(char)
                stack.append(int_score)
        
        # print(stack)
        res = 0
        for score in stack:
            res = res + score
        return res

        