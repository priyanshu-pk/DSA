class NumArray {

    int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            prefixSum[i]= nums[i] + prefixSum[i-1];
        }
        
    }
    
    public int sumRange(int left, int right) {
        if(left>0){
            return prefixSum[right]-(prefixSum[left-1]);
        }
        else 
        return prefixSum[right];
        
    }
}