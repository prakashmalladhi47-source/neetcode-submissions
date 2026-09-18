class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        return nums[nums.length-k];
       // for(int i=0; i<nums.length; i++){
       //     if(i==nums.length-k){
       //         var = nums[i];
       //         break;
       //     }
       // }
        
    }
}
