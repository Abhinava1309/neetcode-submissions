class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
       
        int highest=Integer.MIN_VALUE;
        int height=0;
        int width=0;
        int distance=0;

        while(left<right){
            height=Math.min(heights[left],heights[right]);
            width=right-left;
            distance=height*width;
            if(distance>highest){
                
                highest=distance;
            }
           if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return highest;
    }
}
