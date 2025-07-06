import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array
        int closest = nums[0] + nums[1] + nums[2]; // Initialize with first 3 elements

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                // Update closest if current sum is nearer to target
                if (Math.abs(currSum - target) < Math.abs(closest - target)) {
                    closest = currSum;
                }

                if (currSum < target) {
                    left++; // Need a bigger sum
                } else if (currSum > target) {
                    right--; // Need a smaller sum
                } else {
                    return currSum; // Exact match
                }
            }
        }

        return closest;
    }
}
