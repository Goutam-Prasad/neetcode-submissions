class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() < 1) return 0;

        String longest = "";
        int odd=0,even=0;

        for (int i = 0; i < s.length(); i++) {
             odd+= expandFromCenter(s, i, i);
             even+= expandFromCenter(s, i, i + 1);
        }

        return even+odd;
    }

     private int expandFromCenter(String s, int left, int right) {
        int count=0;
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
