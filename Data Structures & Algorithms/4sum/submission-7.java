class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls =new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            
            
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                int j1=j+1;
                int k=n-1;
                long t=(long)target-nums[i]-nums[j];
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                while(j1<k ){
                    long sum=nums[j1]+nums[k];
                    if(sum==t){
                        List<Integer> lk=new ArrayList<>();
                        lk.add(nums[i]);
                        lk.add(nums[j]);
                        lk.add(nums[j1]);
                        lk.add(nums[k]);
                        ls.add(lk);
                        
                        j1++;
                        k--;
                        while(j1<k && nums[j1]==nums[j1-1]){
                            j1++;
                        }
                        while(j1<k && nums[k]==nums[k+1]){
                            k--;
                        }
                    }else if(sum>t){
                        k--;
                    }else{
                        j1++;
                    }
                }
            }
        }
        return ls;
    }
}