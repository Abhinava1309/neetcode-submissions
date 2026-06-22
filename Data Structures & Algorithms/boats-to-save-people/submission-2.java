class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int left=0;
        int right=n-1;
        int count=0;
        Arrays.sort(people);
        int i=0;
        int cob=0;
        while(i<n && people[i]<=limit){
            i++;
            count++;
        }
        right=count-1;
        int max=Integer.MAX_VALUE;

        while(left<=right){
            
            if(people[left]+people[right] <=limit){
                cob++;
                left++;
                right--;
            }
            else{
                cob++;
                right--;
            }
        }
        return cob;
    }
}