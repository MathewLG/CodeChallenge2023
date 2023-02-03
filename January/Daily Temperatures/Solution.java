class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> days = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            int[] pair = new int[]{i, temperatures[i]};
            while(!days.isEmpty() && pair[1] > days.peek()[1]){
                int[] current = days.pop();
                res[current[0]] = i - current[0];
            }
            days.push(pair);
        }
        return res;
    }
}