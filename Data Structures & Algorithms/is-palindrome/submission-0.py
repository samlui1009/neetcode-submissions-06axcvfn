class Solution:
    def isPalindrome(self, s: str) -> bool:
        newStr = ""
        # Sets up a new variable called newString
        # Removes all alpha-numerical from the input string

        for c in s:
            # Iterate through every character in string, s
            if c.isalnum():
                # If the character is alpha-numerical
                newStr += c.lower()
                # Include it in the newString variable
        return newStr == newStr[::-1]
        # Then, return the boolean result of whether the reverse equals the newString
        