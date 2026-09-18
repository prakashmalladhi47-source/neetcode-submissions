class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int var = 0;
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-k){
                var = nums[i];
                break;
            }
        }
        return var;
    }
}
