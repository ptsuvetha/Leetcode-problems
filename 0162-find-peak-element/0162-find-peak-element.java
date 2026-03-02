class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak must be on the right side
                l = mid + 1;
            } else {
                // Peak could be mid or on the left side
                r = mid;
            }
        }

        // l == r is the peak
        return l;
    }
}