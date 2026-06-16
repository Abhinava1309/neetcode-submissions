class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int[] arr=new int[2];
        int p1=0;
        int p2=len-1;
        for(int i=0;i<len;i++){
            if(numbers[p1]+numbers[p2]!=target){
                p2--;
                
            }if (numbers[p1]+numbers[p2]==target){
                arr[0]=p1+1;
                arr[1]=p2+1;
            }
            if(p2==p1+1){
                    p1++;
                    p2=len-1;
                    i=p1;
                }
            
        }
        return arr;
    }
}
