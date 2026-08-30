class Solution {
    public int maxDistToClosest(int[] seats) {

        int max = 0;
        int n = seats.length;

        // Empty seats at beginning
        int i = 0;

        while (seats[i] == 0) {
            i++;
        }

        max = i;

        // Empty seats between people
        int last = i;

        for (; i < n; i++) {

            if (seats[i] == 1) {

                int gap = i - last - 1;

                max = Math.max(max, (gap + 1) / 2);

                last = i;
            }
        }

        // Empty seats at the end
        max = Math.max(max, n - 1 - last);

        return max;
    }
}