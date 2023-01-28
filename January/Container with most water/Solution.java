class Solution {
    public int maxArea(int[] height) {
        int currentArea = 0;
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            currentArea = Math.min(height[left], height[right]) * (right-left);
            if(currentArea > maxArea){
                maxArea = currentArea;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;

    }
}