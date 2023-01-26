class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> solution = new ArrayList<>();
        for (int i = 0; i < nums.length-1; ++i) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -nums[i];
            int l = i+1, r = nums.length-1;
            while (l < r) {
                if (nums[l]+nums[r] > target){
                    r--;
                }
                else if (nums[l] + nums[r] < target){
                    l++;
                }
                else {
                    solution.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while (l < r && nums[r] == nums[r+1]){
                        r--;
                    }
                }
            }
        }
        return solution;
    }

}