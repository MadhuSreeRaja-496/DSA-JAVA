class Solution {
    public int lowerBound(int[] nums, int x) {
       int size=nums.length;
       int s=0;
       int l=size-1;
       int ans=size;
       while(s<=l){
        int mid=s+(l-s)/2;
        if(nums[mid]>=x){
            ans=mid;
            l=mid-1;
         }
        else{
            s=mid+1;
        }
       
            
        }
        return ans;
       

     }
}
