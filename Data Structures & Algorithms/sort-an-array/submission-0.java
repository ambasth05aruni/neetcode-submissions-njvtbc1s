class Solution {
    public int[] sortArray(int[] nums) {
        //SELECTION SORT
        //1.find the min in the array. 
        //2.swap it with its correct index
       
       for(int i=0;i<nums.length-1;i++){
        int minIndex = i;
        //now find the minimum
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]<nums[minIndex]){
                minIndex = j;
            }
        }
        int temp = nums[i];
        nums[i]=nums[minIndex];
        nums[minIndex]=temp;
       }

return nums;

    }
}