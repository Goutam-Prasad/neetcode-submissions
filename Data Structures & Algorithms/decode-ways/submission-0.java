class Solution {
    public int numDecodings(String s) {
        return decodeRecursive(s, 0);
    }
    private int decodeRecursive(String s, int index) {
        if (index == s.length()) {
            return 1;
        }
        if (s.charAt(index) == '0') {
            return 0;
        }
        int ways = decodeRecursive(s, index + 1);        
        if (index + 1 < s.length()) {
            int twoDigit = Integer.parseInt(s.substring(index, index + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                ways += decodeRecursive(s, index + 2);
            }
        }
        
        return ways;
    }
}