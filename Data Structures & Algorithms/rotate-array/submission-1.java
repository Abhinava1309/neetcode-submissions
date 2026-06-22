class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int last=n-1;
        int first=0;
        k=k%n;
        reverse(nums,first,last);
        reverse(nums,first,k-1);
        reverse(nums,k,last);
       
    }
    public void reverse(int[] nums, int first,int last){
        
        while(first<last){
            int temp= nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
        }
    }
}