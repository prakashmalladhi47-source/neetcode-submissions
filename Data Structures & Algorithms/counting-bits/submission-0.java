class Solution {
    public int[] countBits(int n) {
        
       int arr[] = new int[n+1];
       for(int i=0; i<=n; i++){
        int count = 0;
        String s =  Integer.toBinaryString(i);
        for(int j=0; j<s.length(); j++){
            if(s.charAt(j)=='1')
               count++;
        }
        arr[i] = count;
       } 
       return arr;
    }
}
