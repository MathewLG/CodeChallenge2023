class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean result = false;
        //Step 1. Look for duplicates in each row
        for(int i = 0; i < board.length; i++){
            result = containsDuplicate(board[i]);
            if(result == true){
                return false;
            }
        }
        //Step 2. Look for duplicates in each column
        for(int i = 0; i < board.length; i++){
            char[] currentRow = new char[board[0].length];
            for(int j = 0; j < board[0].length; j++){
                currentRow[j] = board[j][i];
            }
            result = containsDuplicate(currentRow);
            if(result == true){
                return false;
            }
        }
        //Step 3. Look for duplicates in each 3x3 section
        for(int i = 1; i < board.length; i+=3){
            for(int j = 1; j < board[0].length; j+=3){
                char[] currentSquare = new char[9];
                char center = board[i][j];
                char up = board[i-1][j];
                char down = board[i+1][j];
                char left = board[i][j-1];
                char right = board[i][j+1];
                char topleft = board[i-1][j-1];
                char topright = board[i-1][j+1];
                char bottomleft = board[i+1][j-1];
                char bottomright = board[i+1][j+1];
                currentSquare[0] = center;
                currentSquare[1] = up;
                currentSquare[2] = down;
                currentSquare[3] = left;
                currentSquare[4] = right;
                currentSquare[5] = topleft;
                currentSquare[6] = topright;
                currentSquare[7] = bottomleft;
                currentSquare[8] = bottomright;
                result = containsDuplicate(currentSquare);
                if(result == true){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean containsDuplicate(char[] nums) {
        HashMap<Character, Integer> occurences = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != '.'){
                if(occurences.get(nums[i]) == null){
                    occurences.put(nums[i], 1);
                }else{
                    occurences.put(nums[i], occurences.get(nums[i]) + 1);
                }
            }

        }
        for(Integer current : occurences.values()){
            if(current > 1){
                return true;
            }
        }
        return false;
    }

}