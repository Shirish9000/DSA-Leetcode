class Solution {
    public boolean isPalinSent(String s) {
        // code here
        boolean palindrome=true;
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        
        for(int i =0; i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                palindrome = false; 
                break;
            }
        }
        return palindrome;
        
    }
}