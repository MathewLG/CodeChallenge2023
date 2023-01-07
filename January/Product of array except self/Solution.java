class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for(int i = 0; i < nums.length; i++){
            products[i] = prefix;
            prefix = prefix * nums[i];
        }
        for(int i = nums.length-1; i >= 0; i--){
            products[i] = postfix * products[i];
            postfix = postfix * nums[i];
        }
        return products;
    }
}
