class Solution {
    public int lengthOfLongestSubstring(String s) {
        int le=0;
        int re=0;
        Set<Character> has=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(has.contains(s.charAt(i))){
                has.remove(s.charAt(le));
                le++;
            }
            has.add(s.charAt(i));
            re=Math.max(re,i-le+1);
            
        }
        
        return re;
    }
}
