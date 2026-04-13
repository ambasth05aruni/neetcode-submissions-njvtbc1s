class Solution {
    public int[] twoSum(int[] numbers, int target) {
// since the array is sorted we can easily use two pointers method
    int n = numbers.length -1;
    int start = 0;
    int end = n;

    while(start<end){
        int sum = numbers[start] + numbers[end];
        if(sum>target){
            end--;
        }
        else if(sum<target){
            start++;
        }
        else{
            return new int[]{start+1, end+1};
        }
        }
    

return new int[]{-1, -1};



    }
}
