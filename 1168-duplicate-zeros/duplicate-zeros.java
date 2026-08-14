class Solution {
    public void duplicateZeros(int[] arr) {

        int zeros = 0;

        // Count zeros
        for (int x : arr) {
            if (x == 0) {
                zeros++;
            }
        }

        int i = arr.length - 1;
        int j = arr.length + zeros - 1;

        // Work from right to left
        while (i < j) {

            // Copy current element if j is inside array
            if (j < arr.length) {
                arr[j] = arr[i];
            }

            // If current element is zero,
            // duplicate it
            if (arr[i] == 0) {
                j--;

                if (j < arr.length) {
                    arr[j] = arr[i];
                }
            }

            i--;
            j--;
        }
    }
}