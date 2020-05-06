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