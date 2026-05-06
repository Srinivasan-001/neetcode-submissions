class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> map=new HashMap<>();

     List<Integer>[] fre=new List[nums.length+1];

     for(int i=0;i<fre.length;i++){

     fre[i]=new ArrayList<>();
     }
      

     for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
     }

     for(Map.Entry<Integer,Integer> take:map.entrySet()){
      fre[take.getValue()].add(take.getKey());
     }

     int[] arr=new int[k];
     int index=0;
     for(int n=fre.length-1;n>0 && index<k ;n--){
      for(int i:fre[n]){
      arr[index]=i;
      index++;
      }
      
      if(index>k){
        return arr;
      }
     }

     return arr;
    }
}
