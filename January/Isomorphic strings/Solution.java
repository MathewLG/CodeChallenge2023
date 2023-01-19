class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(sMap.get(s.charAt(i)) == null){
                sMap.put(s.charAt(i), t.charAt(i));
            }else{
                if(sMap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(tMap.get(t.charAt(i)) == null){
                tMap.put(t.charAt(i), s.charAt(i));
            }else{
                if(tMap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }

        }
        return true;

    }

}




