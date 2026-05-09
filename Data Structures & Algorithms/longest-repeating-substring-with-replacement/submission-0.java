class Solution {
   public int characterReplacement(String s, int k) {
    int maxLen = 0;
    
    for (char c = 'A'; c <= 'Z'; c++) {
        int l = 0;
        int replacements = 0;
        
        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) != c) {
                replacements++;
            }
            while (replacements > k) {
                if (s.charAt(l) != c) {
                    replacements--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }
    }
    
    return maxLen;
}
}
