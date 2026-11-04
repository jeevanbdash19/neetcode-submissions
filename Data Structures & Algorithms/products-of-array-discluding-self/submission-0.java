class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        int prifix = 1;

        for(int i =0;i<nums.length;i++){
            res[i] = prifix;
            prifix *= nums[i]; 
        }
        int sufix = 1;
        for(int j = nums.length-1;j >=0;j--){
            res[j] = sufix * res[j];
            sufix = sufix * nums[j];
        }

        return res;
        
    }
}  
