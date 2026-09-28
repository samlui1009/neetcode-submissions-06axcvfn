class Solution:
    def isPathCrossing(self, path: str) -> bool:
        x = 0 
        y = 0 

        visited = set()

        # Include origin inside of visited
        visited.add((0,0))

        for char in path:
            if char == 'N':
                y += 1
                if (x,y) in visited:
                    return True
                else:
                    visited.add((x, y))
            elif char == 'S':
                y -= 1
                if (x, y) in visited:
                    return True
                else:
                    visited.add((x, y))
            elif char == 'E':
                x += 1
                if (x, y) in visited:
                    return True
                else:
                    visited.add((x, y))                
            elif char == 'W':
                x -= 1
                if (x, y) in visited:
                    return True
                else:
                    visited.add((x, y))
        print(visited)
        return False
            
        

        