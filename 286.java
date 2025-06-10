// LeetCode Problem 286: Missing Number...


class Solution {
  public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=n*(n+1)/2;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return total-sum;
    }
    }
