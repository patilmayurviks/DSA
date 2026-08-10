class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> list=new ArrayList<>();
        int num=0;
        for(int bit:nums){
            num=(num*2+bit)%5;
            list.add(num==0);
        }
        return list;
        
    }
}