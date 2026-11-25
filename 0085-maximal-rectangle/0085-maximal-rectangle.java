class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int n = matrix[0].length;
        int[] height = new int[n];
        int max = 0;

        for (char[] row : matrix) {
            for (int j = 0; j < n; j++) {
                height[j] = row[j] == '1' ? height[j] + 1 : 0;
            }

            max = Math.max(max, largestRectangle(height));
        }

        return max;
    }

    int largestRectangle(int[] h) {
        int max = 0;
        java.util.Stack<Integer> st = new java.util.Stack<>();

        for (int i = 0; i <= h.length; i++) {
            int cur = (i == h.length) ? 0 : h[i];

            while (!st.isEmpty() && h[st.peek()] > cur) {
                int height = h[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(max, height * width);
            }

            st.push(i);
        }

        return max;
    }
}