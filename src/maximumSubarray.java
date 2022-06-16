public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxsofar = nums[0];
        for(int i=1;i<nums.length;i++){
            maxsofar = Math.max(maxsofar + nums[i], nums[i]);
            max = Math.max(max, maxsofar);
        }
        return max;
    }
    /*--------another solution--------*/
    public int maxSubArray1(int[] nums) {
        int n = nums.length;
        int SUM = nums[0];
        int OPT = nums[0];
        for (int i = 1; i < n; ++i) {
            SUM = Math.max(SUM + nums[i], nums[i]);
            OPT = Math.max(OPT, SUM);
        }
        return OPT;
    }
}
