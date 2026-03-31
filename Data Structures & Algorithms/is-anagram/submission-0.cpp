#include <unordered_map>
#include <string>

class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) {
            return false;
            // Immediate failure - If the string lengths are both different, we know they 
            // cannot be anagrams
        }
        unordered_map<char, int> tempMap;
        // Initialize a temporary map to store characters as the key, and 
        // number of occurrences as the value
        for (int i = 0; i < s.length(); i++) {
            if (tempMap.find(s[i]) == tempMap.end()) {
                tempMap[s[i]] = 1;
                // Attempts to find s's character in the map
                // If it doesn't find it, then add it into the 
                // tempMap, with a value of 1
            } else {
                tempMap[s[i]]++;
                // Otherwise, increment by 1
            }
        }
        // Set up of the hashmap is now complete
        for (int j = 0; j < t.length(); j++) {
            if (tempMap.find(t[j]) != tempMap.end()) {
                tempMap[t[j]]--;
            }
        }
        // Iterate through the length of string, t 
        // If we find the corresponding character in the tempMap
        // Then, we decrement

        for (const auto& pair : tempMap) {
            if (pair.second != 0) {
                return false;
            }
        }
        return true;
        // Then, iterate through each key-value pair in the tempMap
        // If any of the values do NOT return 0, then we know it's not an anagram
    }
};
