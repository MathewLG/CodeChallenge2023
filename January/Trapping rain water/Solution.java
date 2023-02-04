class Solution {
    public int trap(int[] height) {
        int result = 0;
        int leftPointer = 0;
        int rightPointer = height.length-1;
        int maxHeightLeft = height[leftPointer];
        int maxHeightRight = height[rightPointer];
        while(leftPointer < rightPointer){
            int currentWater = 0;
            if(maxHeightLeft <= maxHeightRight){
                leftPointer++;
                if(height[leftPointer] > maxHeightLeft) maxHeightLeft = height[leftPointer];
                currentWater = maxHeightLeft - height[leftPointer];
            }else{
                rightPointer--;
                if(height[rightPointer] > maxHeightRight) maxHeightRight = height[rightPointer];
                currentWater = maxHeightRight - height[rightPointer];
            }
            if(currentWater > 0) result += currentWater;
        }
        return result;
    }
}