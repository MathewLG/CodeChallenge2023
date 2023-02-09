class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int min = 0;
        int max = matrix.length-1;
        while(min <= max){
            int mid = min + (max - min) / 2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[mid].length-1] >= target){
                return search(matrix[mid], target);
            }else{
                if(target < matrix[mid][0]){
                    max = mid-1;
                }else{
                    min = mid+1;
                }
            }
        }
        return false;
    }
    public boolean search(int[] array, int target){
        int min = 0;
        int max = array.length -1;
        while(min <= max){
            int mid = min + (max - min) / 2;
            if(array[mid] == target){
                return true;
            }else{
                if(array[mid] < target){
                    min = mid + 1;
                }else{
                    max = mid - 1;
                }
            }
        }
        return false;
    }
}