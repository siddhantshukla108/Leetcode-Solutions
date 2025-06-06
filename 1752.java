// LeetCode Problem 1752: Check if Array Is Sorted and Rotated



//The approach:
//1.Go through the array and find the point where nums[i] is greater than nums[i + 1]. This indicates a potential rotation point.
//1b.If there is not any rotation point and array is in non-decreasing order then return true.
//2.If there is more than one rotation point, return false.
//3.If there is exactly one rotation point, confirm that the remainder of the array is in non-decreasing order.
//4.Lastly, make sure that the last element of the array is less than or equal to the first element.


// 1st Approach: O(n) time complexity, O(1) space complexity

class Solution {
    int rotation=0;
    int index;
       public boolean check(int[] nums) {

        for (int i=1,j=i-1;i<nums.length;i++,j++){
            if (nums[j]>nums[i]){
                index=j;
                rotation++;
                if(rotation==2){
                    break;
                }
            }
            else {
                if (i== nums.length-1 && rotation<1){
                    return true;
                }
            }
        }
        if(rotation==2){
            return false;
        }
        else {
            for (int i=1,j=i-1;i<=index;i++,j++){
                if(nums[j]>nums[i]){
                    return false;
                }
            }
            if (nums[0]<nums[nums.length-1]){
                return false;
            }
            else return true;

        }
    }

}

// 2nd Approach: O(n) time complexity, O(1) space complexity


class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Use modulo to wrap around from last to first element
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
                // More than one drop => not valid
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
