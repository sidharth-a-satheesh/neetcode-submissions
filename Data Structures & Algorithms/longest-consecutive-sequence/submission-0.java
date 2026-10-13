class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        int longest = 0;
        int count = 0;
        for(int num: nums){
            numSet.add(num);
        }
        for(int num: nums){
            if(!numSet.contains(num-1)){
                count=1;
                while(numSet.contains(num+count)){
                    count++;
                }
                if(count>longest){
                    longest = count;
                }
            }
        }
        return longest;
    }
}
