class Solution {
    public boolean isAnagram(String s, String t) {
    // The function takes in 2 parameters, both which are Strings 
    // The final result that we should be returning is going to be a Boolean value 
    // An anagram: Two words are of the same length, and are comprised of the 
    // Same number of characters
    // Edge case: 'a' and 'a' = Yes, they would anagrams?
    // Edge case: 'b' and 'a' = No, they are not anagrams 
    // First thing to do:
    // Double check and make sure that s and t are of the same length
    // If they are NOT the same length, then we could return back false immediately 

    int s_length = s.length();
    int t_length = t.length();
    if (s_length != t_length) {
        return false;
    }

    // We now have established that conditional first 
    // We must loop through every character in String, s, and put it into our new temporary hashmap
    // If this character is new and we haven't seen it before, then we add it into the hashmap 
    // As a new key, with a value of 1 
    // If this character is NOT new, then we increment 1 to the value

    HashMap<Character, Integer> tempMap = new HashMap<>();
    // Instantiate the new hashmap first
    for (int i = 0; i < s.length(); i++) {
        if (!tempMap.containsKey(s.charAt(i))) {
            tempMap.put(s.charAt(i), 1);
        } else {
            // Otherwise, if we HAVE seen it before, then what we could do:
            int keyValue = tempMap.get(s.charAt(i));
            keyValue++;
            tempMap.put(s.charAt(i), keyValue);
            // Increment the value for that character, cause it means we have now
            // Seen the character one more time
        }
    }

    // We can then loop through the string, t 
    // If we encounter a character that is part of the key-value pairs
    // in the temporary map 
    // Then, we can decrement it
    for (int j = 0; j < t.length(); j++) {
        if (tempMap.containsKey(t.charAt(j))) {
            int keyValue = tempMap.get(t.charAt(j));
            keyValue--;
            tempMap.put(t.charAt(j), keyValue);
        }
    }

    // Finally, an anagram should contain the same number of characters
    // And the exact same combination
    // Meaning that the final character occurrence count should all be 0 

    Collection<Integer> anagramCollection = tempMap.values();
    for (Integer count : anagramCollection) {
        if (count != 0) {
            return false;
        }
    }
    return true;
    }
}
