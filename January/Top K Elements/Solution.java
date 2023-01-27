class Solution {

    class Valor implements Comparable<Valor>{
        public int count;
        public int value;

        public Valor(int value, int count){
            this.count = count;
            this.value = value;
        }
        @Override
        public int compareTo(Valor other) {
            if(this.count == other.count){
                return 0;
            }else if(this.count < other.count){
                return -1;
            }else{
                return 1;
            }
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] solution = new int[k];
        PriorityQueue<Valor> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        HashMap<Integer, Integer> values = new HashMap<>();
        for(Integer current : nums){
            if(values.get(current) == null){
                values.put(current,1);
            }else{
                values.put(current, values.get(current) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> current :
                values.entrySet()) {
            maxHeap.add(new Valor(current.getKey(), current.getValue()));
        }
        for(int j = 0; j < k; j++){
            solution[j] = maxHeap.poll().value;
        }
        return solution;
    }
}