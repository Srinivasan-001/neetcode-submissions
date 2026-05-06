class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> s=new HashSet<>();
      for(int n:nums){
        s.add(n);
      }

      int longest=0;
      for(int n:s){
        int l=1;
        if(!s.contains(n-1)){
          while(s.contains(n+l)){
             l++;
          }
        }
        longest=Math.max(longest,l);
      }
      return longest;  
    }
}
