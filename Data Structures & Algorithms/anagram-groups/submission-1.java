class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
  Map<String ,List<String>> map=new  HashMap<>();
  for(String s:strs){
    int[] arr=new int[26];

    for(char c:s.toCharArray()){
        arr[c-'a']++;
    }
    String con=Arrays.toString(arr);
    map.putIfAbsent(con,new ArrayList<>());
    map.get(con).add(s);  
  }  

  return new ArrayList<>(map.values());
    }
}
