## Jewels and Stones

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:
Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

# Solution Approach: 
### 1- Using Brute Force (nested loops) to loop through both arrays, this results in a time complexity of O(n^2)

``` Java
class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for (int i = 0; i < J.length(); i++){
            for (int j = 0; j < S.length(); j++){
                if (J.charAt(i) == S.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
```

### 2- Java O(n+m) time, O(1) space using bitwise ops

``` Java
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

```