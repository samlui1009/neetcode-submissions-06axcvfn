class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        # Create a dictionary for chars
        chars_dict = Counter(chars)
        res = 0
        # Start by looping through each word inside of the words list
        for word in words:
            # Set a boolean flag to True, ensuring that we only 
            flag = True
            word_dict = Counter(list(word))
            for key, val in word_dict.items():
                if key not in chars_dict:
                    flag = False
                    break
                elif key in chars_dict and val > chars_dict[key]:
                    flag = False
                    break
                elif key in chars_dict and val <= chars_dict[key]:
                    continue
            if flag:
                res += len(word)
        print(res)
        return res