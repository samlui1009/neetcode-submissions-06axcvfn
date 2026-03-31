#include <unordered_map>

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, int> tempMap;
        for (int x : nums) {
            tempMap[x]++;
            if (tempMap[x] > 1) {
                return true;
            }
        }
        return false;
    }
};
