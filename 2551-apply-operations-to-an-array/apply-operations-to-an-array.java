class Solution {
    public int[] applyOperations(int[] nums) {
        // int j=1;
        // int k=0;
        // int[] arr =new int[nums.length];
        // while(j<nums.length){
        //     if(nums[j-1]==nums[j]){
        //         arr[k]=nums[j-1]*2;
        //         nums[j]=0; 
        //         k++;
        //     }
        //     else if(nums[j-1]!=0){
        //         arr[k]=nums[j-1];
        //         k++;
        //     }
        //     j++;
        // }
        // for(int i=k;i<nums.length;i++){
        //     arr[k]=0;
        // }

        // return arr;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }

        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }
}