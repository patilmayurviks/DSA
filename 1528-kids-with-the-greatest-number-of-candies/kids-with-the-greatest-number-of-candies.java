class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            int kid=candies[i]+extraCandies;
            if(kid>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
        
    }
}