class Solution {
    public int[] sortArray(int[] nums) {
        //SELECTION SORT
        for(int i=0;i<nums.length;i++){
            int smallIndex = i;

            for(int j=i+1;j<nums.length;j++){
                if(nums[smallIndex]>nums[j]){
                    smallIndex=j;
                }
            }
            int temp = nums[smallIndex];
            nums[smallIndex]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}