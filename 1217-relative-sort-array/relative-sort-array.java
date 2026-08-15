class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[]=new int[1001];
        for(int num:arr1){
            freq[num]++;
        }
        int ans[]=new int[arr1.length];
        int k=0;
        for(int num :arr2){
            while(freq[num]>0){
                ans[k]=num;
                k++;
                freq[num]--;
            }
        }
        for(int num=0;num<1001;num++){
            while(freq[num]>0){
                ans[k]=num;
                k++;
                freq[num]--;
            }

        }
        return ans;
    }
}