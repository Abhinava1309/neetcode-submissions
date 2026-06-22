class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            int target=nums[i];
            if(nums[i]>0){
                return ls;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==-target){
                    List<Integer> lk=new ArrayList<>();
                    lk.add(nums[i]);
                    lk.add(nums[j]);
                    lk.add(nums[k]);
                    ls.add(lk);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(sum>-target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ls;
    }
}
