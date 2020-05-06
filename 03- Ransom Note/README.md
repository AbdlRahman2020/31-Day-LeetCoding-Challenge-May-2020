## Ransom Note

Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

# Solution Approach: 
### 

``` Java
class Solution {
    
  public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder();
        sb.append(magazine);
        int length = ransomNote.length(), count = 0;
        for(int i=0;i<length;i++){
            int index = sb.indexOf(ransomNote.charAt(i)+"");
            if(index != -1){
                sb.delete(index, index+1);
                count++;
            }
        }
        System.out.println(count+" cnt "+length+" lnt");
        if(count == length){
            return true;
        }
        return false;
    }
}
```