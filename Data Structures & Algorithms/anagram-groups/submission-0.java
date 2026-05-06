class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> map=new HashMap<>();
     for(String n:strs){
        char[] c=n.toCharArray();
        Arrays.sort(c);
        String s=new String(c);
        map.putIfAbsent(s,new ArrayList<>());
        map.get(s).add(n);
        
     }

     return new ArrayList<>(map.values());  
    }
}
