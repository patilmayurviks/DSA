class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int num: arr){
            sum+=num;
        }
        if(sum%3!=0){
            return false;
        }
        int target=sum/3;
        int parts=0;
        int current=0;
        for(int i=0;i<n;i++){
            current+=arr[i];
            if(current==target){
                parts++;
                current=0;
            }
            if(parts==2 &&  i<n-1){
                return true;
            }
        }
        return false;
    }
}