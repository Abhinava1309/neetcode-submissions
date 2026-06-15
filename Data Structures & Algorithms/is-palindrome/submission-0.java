class Solution {
    public boolean isPalindrome(String s) {
        int len=s.length();
        int fir=0;
        int last=len-1;
        while(fir<last){
            if(s==null){
                return false;
            }
            if(!Character.isLetterOrDigit(s.charAt(fir))){
                fir++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(last))){
                last--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(fir))==Character.toLowerCase(s.charAt(last))){
                fir++;
                last--;
            }else{
                return false;
            }

        }
        return true;
    }
}
