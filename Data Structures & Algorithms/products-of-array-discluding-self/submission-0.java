
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int dup[] = new int[nums.length];

        ans[0] = 1;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int n = nums.length;
        dup[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            dup[i] = dup[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i] * dup[i];
        }

        return ans;
    }
}
