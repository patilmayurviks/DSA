class Solution {
    public int heightChecker(int[] heights) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num : heights){
            pq.add(num);
        }
        int sort[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            sort[i]=pq.poll();
        }
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sort[i]){
                count++;
            }

        }
        return count;
        
    }
}