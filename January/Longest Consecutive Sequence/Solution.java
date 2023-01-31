class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int counter = 0;
        for(Integer current : nums){
            count.put(current, 1);
        }
        for(Integer curr: nums){
            if(count.get(curr-1) == null){
                int length = 0;
                while(count.get(curr++) != null){
                    length++;
                }
                if(length > counter){
                    counter = length;
                }
            }
        }
        return counter;
    }
}