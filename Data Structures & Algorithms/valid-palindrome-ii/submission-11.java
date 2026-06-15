class Solution {
    public boolean validPalindrome(String s) {
        int len=s.length();
        int fir=0;
        int last=len-1;
        while(fir<last){
            if(s.charAt(fir)==s.charAt(last)){
                fir++;
                last--;
            }else{
                return isPalindrome(s, fir + 1, last) || isPalindrome(s, fir, last - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}