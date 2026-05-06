class Solution {
    public boolean isPalindrome(String s) {
      StringBuffer str=new StringBuffer();

      for(char c:s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
          str.append(Character.toLowerCase(c));
        }
      }
      return str.toString().equals(str.reverse().toString());

        
    }
}
