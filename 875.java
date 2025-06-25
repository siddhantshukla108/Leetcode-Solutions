// LeetCode Problem 875: Koko eating bananas...


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int low = 1;
        int high = maxPile;
        int result = maxPile; // Initialize with a safe upper bound

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hoursNeeded = calculateHours(piles, mid);

            if (hoursNeeded <= h) {
                result = mid; // This speed is feasible, try for a smaller one
                high = mid - 1;
            } else {
                low = mid + 1; // Speed is too slow, need to increase
            }
        }
        return result;
    }

    // Helper function to calculate total hours needed for a given speed
    private long calculateHours(int[] piles, int speed) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (long) Math.ceil((double) pile / speed);
        }
        return totalHours;
    }
}