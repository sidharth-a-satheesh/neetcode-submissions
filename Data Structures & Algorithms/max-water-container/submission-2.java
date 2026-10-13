class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int f = 0;
        int b = heights.length - 1;
        while (f < b){
            result = Math.max(result, (b-f) * Math.min(heights[f], heights[b]));
            if (heights[f]<=heights[b])
                f++;
            else
                b--;
        }
        return result;
    }
}
