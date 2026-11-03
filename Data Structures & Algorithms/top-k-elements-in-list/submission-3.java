class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            pq.add(val.getKey());
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] arr = new int[k];
        while(!pq.isEmpty()){
            for(int i =0;i<k;i++){
                arr[i] = pq.poll();
            }
        }
        return arr;
    
    }
}

