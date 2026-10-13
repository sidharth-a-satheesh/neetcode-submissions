class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 1){
            return nums;
        } else if  (nums.length == 0){
            return new int[0];
        }
        int[] product = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            product[i] = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    product[i]*=nums[j];
                }
            }
        }
        return product;
    }
}  
