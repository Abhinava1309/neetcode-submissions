class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=nums1.length;
        int temp=0;
        
        int k=0;
        for(int j=0;j<n;j++){
            nums1[m++]=nums2[k++];
        }
        for(int i=0;i<len-1;i++){
            if(nums1[i]>nums1[i+1]){
                temp=nums1[i];
                nums1[i]=nums1[i+1];
                nums1[i+1]=temp;
                i=-1;
            }
        }
    }
}