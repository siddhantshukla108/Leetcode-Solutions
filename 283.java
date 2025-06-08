// LeetCode Problem 283: Moves Zero to Last...


class Solution{
public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            if (i != j) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }
    }

    for (int i : nums) {
        System.out.println(i);
    }
}
}