class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=k-1;
        int diff=0;
        int min=nums[j]-nums[i];
        while(j<nums.length){
            diff=nums[j]-nums[i];
            if(min>diff){
                min=diff;
            }
            i++;
            j++;
        }
        return min;
    }
}