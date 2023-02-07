class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result, "", 0,0,n);
        return result;

    }
    public void backTrack(List<String> result, String currentString, int left, int right, int pairs){
        if(currentString.length() == pairs * 2){
            result.add(currentString);
            return;
        }
        if(left < pairs) backTrack(result, currentString + "(", left+1, right, pairs);
        if(right < left) backTrack(result, currentString + ")", left, right+1, pairs);
    }

}