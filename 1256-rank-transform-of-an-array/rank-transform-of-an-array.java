class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int rank=1;
        int ans[]=new int[arr.length];
        int sorted[]= arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num: sorted){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);

        }
        return ans;
        
    }
}