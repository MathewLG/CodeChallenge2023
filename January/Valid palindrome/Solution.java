class Solution {
    public boolean isPalindrome(String s) {
        String formated = removeNonAlphanumeric(s).toLowerCase();
        int start = 0;
        int end = formated.length()-1;
        while(start < end){
            char first = formated.charAt(start);
            char last = formated.charAt(end);
            if(first != last){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static String removeNonAlphanumeric(String str)
    {
        str = str.replaceAll(
                "[^a-zA-Z0-9]", "");
        return str;
    }
}