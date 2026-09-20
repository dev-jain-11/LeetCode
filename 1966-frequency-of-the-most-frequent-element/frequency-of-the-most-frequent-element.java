import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int len = nums.length;
        int l = 0, r = 0;
        long windowSum = 0;
        int max = 1;

        while (r < len) {

            windowSum += nums[r];

            long operationsRequired =
                    (long) nums[r] * (r - l + 1) - windowSum;

            while (operationsRequired > k) {

                windowSum -= nums[l];
                l++;

                operationsRequired =
                        (long) nums[r] * (r - l + 1) - windowSum;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}