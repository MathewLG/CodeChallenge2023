class Solution {
    public boolean isSubsequence(String s, String t) {
        int currentIndex = 0;
        if(s.length() > t.length()){
            return false;
        }
        for(Character currentChar : t.toCharArray()){
            if(currentIndex >= s.length()){
                break;
            }
            if(currentChar == s.charAt(currentIndex)){
                currentIndex++;
            }
        }
        return currentIndex == s.length();
    }
}