class Solution {
    public boolean isPalindrome(int x) {
        int dub = x;
        int rev = 0;
        
        while(x>0){
            int last = x%10;
            x = x/10;
            rev = (rev*10)+last;
        }

        if(rev == dub){
            return true;
        }else{
            return false;
        }
    }
}