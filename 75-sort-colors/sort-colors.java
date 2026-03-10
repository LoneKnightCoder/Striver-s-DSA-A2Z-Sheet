class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int temp0 = 0, temp1 = 0, temp2 = 0;

        // Step 1: Count the occurrences of 0, 1, and 2
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                temp0++;
            } else if (nums[i] == 1) {
                temp1++;
            } else {
                temp2++;
            }
        }

        // Step 2: Overwrite the original array
        for (int i = 0; i < temp0; i++) {
            nums[i] = 0;
        }
        for (int i = temp0; i < temp0 + temp1; i++) {
            nums[i] = 1;
        }
        for (int i = temp0 + temp1; i < n; i++) {
            nums[i] = 2;
        }
    }
}