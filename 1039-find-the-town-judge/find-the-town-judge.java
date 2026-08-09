class Solution {
    public int findJudge(int n, int[][] trust) {
        int given[]=new int[n+1];
        int recive[]=new int[n+1];
        int m=trust.length;
        for(int i=0;i<m;i++){
            int a=trust[i][0];
            int b=trust[i][1];
            given[a]++;
            recive[b]++;



        }
        for(int i=1;i<=n;i++){
            if(given[i]==0 && recive[i]==n-1){
                return i;
            }
        }
        return -1;

        
    }
}