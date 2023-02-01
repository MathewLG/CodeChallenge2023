class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> response = new ArrayList<>();
        HashMap<ArrayList<Integer>, ArrayList<String>> anagrams = new HashMap<>();
        for(String current : strs){
            ArrayList<Integer> charCount = new ArrayList<>(Collections.nCopies(26, 0));
            for(Character c : current.toCharArray()){
                int asciiValue = (int) c;
                int index = asciiValue - (int) 'a';
                charCount.set(index, charCount.get(index)+1);
            }
            if(anagrams.get(charCount) == null){
                ArrayList res = new ArrayList();
                res.add(current);
                anagrams.put(charCount,res);
            }else{
                ArrayList res = anagrams.get(charCount);
                res.add(current);
                anagrams.put(charCount, res);
            }
        }
        for (Map.Entry<ArrayList<Integer>, ArrayList<String>>  entry : anagrams.entrySet()) {
            ArrayList<Integer> key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            ArrayList<String> col = new ArrayList<String>();
            for(String currentString : value){
                col.add(currentString);
            }
            response.add(col);
        }
        return response;

    }

}