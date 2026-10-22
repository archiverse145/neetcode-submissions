class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxvol=0;
        while(left<right){
            int walllen=Math.min(heights[left],heights[right]);
            int vol=right-left;

            int waterstored=vol*walllen;
            maxvol=Math.max(maxvol,waterstored);

            if (heights[left] > heights[right]) {
                right--;
            } else if (heights[left] < heights[right]) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        return maxvol;
    }
}
