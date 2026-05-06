class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;int r=numbers.length-1;
        while(l<r){
          int count=numbers[l]+numbers[r];
          if(count>target){
            r--;
          }
          else if(count<target){
            l++;
          }
          else{
            return new int[]{l+1,r+1};
          }
        }
        return new int[]{};
    }
}
