class Solution {
    public int singleNumber(int[] nums) {
        int prec=0;
        for(int i=0;i<nums.length;i++)
        {
            prec ^= nums[i];
        }
        return prec;
    }
}