class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        for(int num:nums){
            total+=num;
        }
        List<Integer> list=new ArrayList<>();
        int selected=0;
        for(int i=nums.length-1;i>=0;i--){
            list.add(nums[i]);
            selected+=nums[i];
            int remaining=total-selected;
            if(selected>remaining){
                break;

            }
        }
        return list;

        
    }
}