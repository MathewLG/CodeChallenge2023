class Solution {
    public int maxProfit(int[] prices) {
        int currentProfit = 0;
        int max = 0;
        int leftPointer = 0;
        int rightPointer = 1;
        while(rightPointer < prices.length){
            if(prices[leftPointer] < prices[rightPointer]){
                currentProfit = prices[rightPointer] - prices[leftPointer];
                if(currentProfit > max){
                    max = currentProfit;
                }
            }else{
                leftPointer = rightPointer;
            }
            rightPointer++;
        }
        return max;
    }
}