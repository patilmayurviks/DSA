import java.util.*;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < s.length();) {
            int count = 1;
            int j = i + 1;

            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }

            if (count >= 3) {
                list.add(Arrays.asList(i, j - 1));
            }

            i = j;
        }

        return list;
    }
}