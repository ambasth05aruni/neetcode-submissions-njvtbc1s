class Solution {
    public int[] sortArray(int[] nums) {
        //Selection sort
        //1. Trvserse the array and find teh smallest number
        //2. put it atteh smallest index


        for(int i=0;i<nums.length;i++){
            int minIndex=i;

            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    int temp = nums[minIndex];
                    nums[minIndex] = nums[j];
                    nums[j]= temp;
                }
            }
        }
        return nums;

    }
}