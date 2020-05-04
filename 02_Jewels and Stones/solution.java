class Solution {
    public int numJewelsInStones(String J, String S) {

        long x = 0;
         for(int i=0;i<J.length(); i++){
            x = x | ( 1L << (J.charAt(i) - 'A') );
         }

        int res = 0;
        for(int i=0; i<S.length(); i++)
             res +=  ( x & ( 1L << (S.charAt(i) - 'A') ) ) == 0 ? 0 : 1;
        
        return res;
        
    }
}