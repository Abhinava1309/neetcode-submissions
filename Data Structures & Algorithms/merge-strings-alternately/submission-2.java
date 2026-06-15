class Solution {
    public String mergeAlternately(String word1, String word2) {
        int fir1=0;
        int fir2=0;
        int l1=word1.length();
        int l2=word2.length();
        StringBuilder finalword=new StringBuilder();
        for(int i=0;i<=l1+l2-2;i++){
            if(fir1<=l1-1){
                finalword.append(word1.charAt(fir1++));
                
            }
            if(fir2<=l2-1){
                finalword.append(word2.charAt(fir2++));
                
            }
            
        }
        return finalword.toString();
    }
}