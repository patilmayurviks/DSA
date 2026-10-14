class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(isprime(nums[i][i])){
                max=Math.max(max,nums[i][i]);
            }
            if(isprime(nums[i][n-1-i])){
                max=Math.max(max,nums[i][n-i-1]);
            }

            
        }
        return max;
        
    }
    private boolean isprime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}