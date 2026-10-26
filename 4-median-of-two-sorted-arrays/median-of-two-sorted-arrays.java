class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int ans[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[k++]=nums1[i++];


            }else{
                ans[k++]=nums2[j++];
            }


        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        while(j<n){
            ans[k++]=nums2[j++];
        }

        int len=ans.length;
        if(len%2==1){
            return ans[len/2];
        }else{
           return  ((double) ans[len/2-1]+ans[len/2])/2;
        }
        
    }
}