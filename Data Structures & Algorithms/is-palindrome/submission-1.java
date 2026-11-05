class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i = 0;
        int j = str.length()-1;
        char [] ch = str.toCharArray();
        while(i<j){
            if(ch[i] != ch[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
