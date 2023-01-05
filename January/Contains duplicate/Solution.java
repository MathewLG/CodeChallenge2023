class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> occurences = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(occurences.get(nums[i]) == null){
                occurences.put(nums[i], 1);
            }else{
                occurences.replace(nums[i], occurences.get(nums[i]) + 1);
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