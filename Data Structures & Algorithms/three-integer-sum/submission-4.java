class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ls=new ArrayList<>();
       int n=nums.length;
       
       Arrays.sort(nums);
        
       for(int i=0;i<n-2;i++){
        int j=i+1;
        int k=n-1;
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        if(nums[i]>0){
            return ls;
        }
        while(j<k){
            if((nums[j]+nums[k] == -nums[i])){
                List<Integer> lk=new ArrayList<>();
                lk.add(nums[i]);
                lk.add(nums[j]);
                lk.add(nums[k]);
                ls.add(lk);
                k--;
                j++;
                while(j<k && nums[j]==nums[j-1]){
                    j++;
                }while(j<k && nums[k]==nums[k+1]){
                    k--;
                }
            }
            if(nums[j]+nums[k]< -nums[i]){
                j++;
                }
            if(nums[j]+nums[k]> -nums[i]){
                k--;
                }
            
            
        }
       }
       return ls;
    }
}
