class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;

        int ans[]=new int[nums.length];
        int left =0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int leftsum=nums[left]*nums[left];
            int rightsum=nums[right]*nums[right];
            if(leftsum>rightsum){
                ans[index]=leftsum;
                left++;
            }else{
                ans[index]=rightsum;
                right--;
            }
            index--;
        }
        return ans;
        
        
    }
}