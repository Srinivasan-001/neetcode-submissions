class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer> arr1=new HashMap<>();
        HashMap<Character,Integer> arr2=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            arr1.put(s.charAt(i),arr1.getOrDefault(s.charAt(i),0)+1);
            arr2.put(t.charAt(i),arr2.getOrDefault(t.charAt(i),0)+1);
        }
        return arr1.equals(arr2);

    }
}
