class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0;i<nums.length-2;i++){
            Set<Integer> set1 = new HashSet<>();
            for(int j =i+1;j<nums.length;j++){
                int comp =- (nums[i]+nums[j]);

                if(set1.contains(comp)){
                    List<Integer> list = Arrays.asList(nums[i],nums[j], comp);
                    Collections.sort(list);
                    set.add(list);
                }else{
                    set1.add(nums[j]);
                }


            }
        }
        return new ArrayList<>(set);
    }
}
