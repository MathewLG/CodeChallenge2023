package twosum;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();
        int complemento = 0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            values.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++){
            complemento = target - nums[j];
            if(values.get(complemento) != null && values.get(complemento) != j){
                result[0] = j;
                result[1] = values.get(complemento);
                return result;
            }
        }
        return result;
    }
    
}