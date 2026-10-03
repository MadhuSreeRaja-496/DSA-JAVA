class Solution {
    public int searchInsert(int[] nums, int target) {
        int size=nums.length;
        int s=0;
        int l=size-1;
        int ans=-1;
        boolean targ=false;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(target>nums[mid]){
                s=mid+1;
            }
            else if(target<nums[mid]){
                l=mid-1;
            }
            else{
                ans=mid;
                targ=true;
                break;
            }
        }
        return (targ?ans:s);
        
    }
}