class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max = 0;
        for(int i: nums){
           count = (i==1) ? count+1 : 0;
           max = Math.max(max,count);
        }
        return max;
    }
}