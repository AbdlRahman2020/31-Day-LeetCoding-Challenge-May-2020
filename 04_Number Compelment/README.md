## Number Complement

Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.

 

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

Constraints:

The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
num >= 1
You could assume no leading zero bit in the integer’s binary representation.
This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/

# Solution Approach: 
### 

Here, first we are going to find total number of bits in number.
Then power(2, total number of bits)-1 and XOR of given number produces the complement of given number.

[Example]

Take num = 5
 
Total bits is 3, using log(5)/log(3)+1, neglect decimal value .
Then, pow(2, 3)-1 [which describes maximum decimal number formed using n number of total bits, here total bits is 3, which means maximum number formed will be 7(111)].
Finally, XOR of maximum number and given number will produce result. [7(111) ^ 5(101) = 2(010)]

``` Java
class Solution {
    public int findComplement(int num) {
       
        int totalBits = (int)(Math.floor(Math.log(num) / Math.log(2))) + 1;
        return (int)(Math.pow(2, totalBits)-1) ^ num;
       
    }
}
```