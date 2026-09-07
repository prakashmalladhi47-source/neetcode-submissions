class Solution {
    public int reverse(int x) {
        
        int n = Math.abs(x);
        int sum = 0;
        while(n > 0){
            int digit = n%10;
        if(sum<Integer.MIN_VALUE/10 || sum>Integer.MAX_VALUE/10)
            return 0;
            sum = (sum * 10) + digit;
            n = n/10;
        }
        if(x<0) return -1*sum;
        return sum;
    }
}
