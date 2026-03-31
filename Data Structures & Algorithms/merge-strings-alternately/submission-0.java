class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Length = word1.length();
        int w2Length = word2.length();
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < w1Length || j < w2Length) {
            if (i < w1Length) {
                res.append(word1.charAt(i++));
            }
            if (j < w2Length) {
                res.append(word2.charAt(j++));
            }
        }
        return res.toString();
    }
}