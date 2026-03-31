class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> result;
        // Initialize a new vector of Integer type, called result 
        for (int i = 0; i < nums.size(); i++) {
            result.push_back(nums[i]);
        }
        for (int j = 0; j < nums.size(); j++) {
            result.push_back(nums[j]);
        }
        return result;
    }
    // Time Complexity: O(n), still, even though there's 2 for loops
    // Run the for loop twice
};