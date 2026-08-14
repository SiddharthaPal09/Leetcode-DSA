class Solution {
    public int minOperations(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<=j){
            if(nums[i]<k){
                count++;
            }
            if(nums[j]<k && i!=j){
                count++;
            }
            i++;
            j--;
        }
        return count;
    }
}