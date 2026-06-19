class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;       
        char[] sorted_s1 = s1.toCharArray();
        Arrays.sort(sorted_s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            char[] new_string = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(new_string);

            if (Arrays.equals(sorted_s1, new_string)) return true;
        }

        return false;
    }
}