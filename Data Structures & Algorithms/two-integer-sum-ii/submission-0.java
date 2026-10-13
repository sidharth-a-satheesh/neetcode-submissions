class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f = 0;
        int b = numbers.length-1;
        while(f<b){
            if(numbers[f]+numbers[b]==target) break;
            else if (numbers[f]+numbers[b]>target) b--;
            else f++;
        }
        return new int[]{f+1,b+1};
    }
}
