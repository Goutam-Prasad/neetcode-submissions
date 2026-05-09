class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> needed = new HashMap<>();
        for (char c : s1.toCharArray()) {
            needed.put(c, needed.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);
        }
        
        if (window.equals(needed)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            char right = s2.charAt(i);
            window.put(right, window.getOrDefault(right, 0) + 1);
            
            char left = s2.charAt(i - s1.length());
            window.put(left, window.get(left) - 1);
            if (window.get(left) == 0) {
                window.remove(left);
            }
            
            if (window.equals(needed)) {
                return true;
            }
        }
    return false;
    }
}