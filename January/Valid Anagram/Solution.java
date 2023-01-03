class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> stringS = new HashMap<>();
        HashMap<Character, Integer> stringT = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(stringS.get(s.charAt(i)) != null){
                stringS.put(s.charAt(i), stringS.get(s.charAt(i)) + 1);
            }else{
                stringS.put(s.charAt(i), 1);
            }
            if(stringT.get(t.charAt(i)) != null){
                stringT.put(t.charAt(i), stringT.get(t.charAt(i)) + 1);
            }else{
                stringT.put(t.charAt(i), 1);
            }
        }
        return stringS.equals(stringT);
    }
}