class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer k = m.get(nums[i]);
            if(k!=null)
            {
                return new int[] {i,k};
            }
            m.put(target-nums[i],i);
        }
        return nums;
    }
}