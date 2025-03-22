// KADANES ALGO
class Solution {
    public int maxSubArray(int[] nums) 
    {
        
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<nums.length;i++)
        {
            // int currSum=0;
            currSum +=  nums[i];
          maxSum=  Math.max(currSum,maxSum);
          if(currSum<0)
          {
            currSum=0;
          }

        }
        return maxSum;
    }
}
