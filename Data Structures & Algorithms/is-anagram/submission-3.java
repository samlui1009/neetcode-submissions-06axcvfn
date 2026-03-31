class Solution {
    public boolean isAnagram(String s, String t) {

        boolean res = false;
        if (s.length() != t.length()) {
            return res;
        }
        // The first guard we need to keep in mind of, if the lengths 
        // Are NOT the same, then we know they can't be anagrams of each other

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int count = map.get(s.charAt(i));
                count++;
                map.put(s.charAt(i), count);
            }
        }
        // Loop through EVERY character within the String, s
        // Now that we have that set up, we can now proceed to loop through the 
        // String, t
        // 

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                int tCount = map.get(t.charAt(i));
                tCount--;
                map.put(t.charAt(i), tCount);
            }
        }
        // What we're doing here is to ultimately double check that
        // we find the same character in the string, t 
        // Retrieve back the count for that character, and decrement it 
        // And re-update the map 

        for (int count : map.values()) {
            if (count != 0) {
                return res;
            }
        }
        res = true;
        return res;
    }
}
