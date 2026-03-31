#include <unordered_map>

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, int> tempMap;
        // Set up a temporary map to store integer value as keys, and 
        // number of occurences as the value 
        for (int i = 0; i < nums.size(); i++) {
            if (tempMap.find(nums[i]) == tempMap.end()) {
                tempMap[nums[i]] = 1;
                // Attempt to find the key for the elements encountered in the nums vector
                // If it's not found, then add it into tempMap with a value of 1
            } else {
                tempMap[nums[i]]++;
                // Otherwise, increment value by 1
            }
        }
        for (const auto& pair : tempMap) {
            if (pair.second >= 2) {
                return true;
            }
        }
        // Then, iterate through each key-value pair in the tempMap
        return false;
    }
};