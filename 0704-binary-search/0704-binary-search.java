class Solution {
    public int search(int[] arr, int target) {
        int high=arr.length-1,low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else return mid;

        }
        return -1;
    }
}