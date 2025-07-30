class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0; // Not enough bars to trap water
        }

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // System.out.println("Left Max Array: " + Arrays.toString(leftMax)); // For debugging

        // Fill rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // System.out.println("Right Max Array: " + Arrays.toString(rightMax)); // For debugging

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            // The water trapped above bar i is min(leftMax[i], rightMax[i]) - height[i]
            // We ensure it's non-negative (Math.max(0, ...)) though min(...) - height[i] will implicitly be >= 0
            // if height[i] is always <= its boundaries.
            totalWater += Math.max(0, Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        return totalWater;
}
}