class Solution {
    public int maxArea(int[] height) {
        int water=Integer.MIN_VALUE,left=0,right=height.length-1;
        while(left<right){
            int length= right-left;
            int curr=Math.min(height[left],height[right])*length;
            water=Math.max(water,curr);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return water;
    }
}