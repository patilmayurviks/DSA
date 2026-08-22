class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] num=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i]=arr[i];
        }
        Arrays.sort(num,(a,b)->{
            int Abits=Integer.bitCount(a);
            int Bbits=Integer.bitCount(b);
            if(Abits!=Bbits){
                return Abits-Bbits;
            }
            return a-b;
        })
        ;
         for(int i=0;i<arr.length;i++){
            arr[i]=num[i];
        }
        return arr;
        
    }
}