class Solution {
    public int findMin(int[] nums) {
        int current = 0;
        int prev = 9999;
        int result = -1;
        for(int i = 0; i < nums.length; i++){
            current = nums[i];
            if(i > 0){
                prev = nums[i-1];
            }
            if(current < prev){
                result = current;
            }
        }
        return result;
    }
}







