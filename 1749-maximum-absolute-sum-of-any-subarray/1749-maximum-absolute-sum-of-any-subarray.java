class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxAbsSum = Math.abs(nums[0]);
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxSum = Math.max(nums[i], maxSum + nums[i]);
            minSum = Math.min(nums[i], minSum + nums[i]);

            maxAbsSum = Math.max(maxAbsSum, Math.max(Math.abs(maxSum), Math.abs(minSum)));
        }

        return maxAbsSum;

    }
}