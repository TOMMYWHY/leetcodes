class Solution {

  public int minSubArrayLen(int target, int[] nums) {
    if (nums == null || nums.length == 0) return 0;

    int i = 0, j = 0;
    int res = nums.length + 1;
    int total = 0;
    while (j < nums.length) {
      total = total + nums[j];
      j++;
      while (total >= target) {
        res = Math.min(res, j - i);
        total = total - nums[i];
        i++;
      }
    }
    if (res == nums.length + 1) {
      return 0;
    } else {
      return res;
    }
  }
}
