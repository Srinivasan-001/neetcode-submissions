class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int c=0;
        int l=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                nums[c]=arr[i];
                c++;
            }
            else{
                nums[l]=0;
                l--;
            }
        }
    
        
    }
}