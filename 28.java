// LeetCode Problem 28: Find the Index of the First Occurrence in a String...

class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        // Edge case: if needle is empty, return 0
        if (nLen == 0) return 0;

        for (int i = 0; i <= hLen - nLen; i++) {
            // Extract substring and compare
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1; // needle not found
    }
}
