//Time Complexity : O(n)
//Space Complexity : O(1)
// did you try it on leetcode : yes

class Solution {
    public int rob(int[] nums) {
       if(nums == null || nums.length == 0)
           return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0], nums[1]);
        
        int choose = nums[0];
        int skip = 0;
        for(int i =1;i<nums.length;i++)
        {
            int prevskip = skip;
            skip = Math.max(skip,choose);
            choose = prevskip + nums[i];
        }
        return Math.max(choose,skip);
    }
}