class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
       int i =0;// will point to start of the nums1 array
       int j = 0; //will point start of nums2 array
       int k = 0; // will point start of temp array

       while(i < m && j< n){
        if(nums1[i] <= nums2[j]){
            temp[k] = nums1[i];
            i++;

        }
        else{
            temp[k]= nums2[j];
            j++;
        }
        k++;
       }
// remaining elemtsn in arr1
       while(i<m){
        temp[k] = nums1[i];
       k++;
       i++;
       }

// remaining elemtsn in arr2
       while(j<n){
       temp[k] = nums2[j];
       k++;
       j++;
       }

    //    now put back the sorted array to temp array
    for(int a = 0; a<temp.length; a++){
        nums1[a] = temp[a];
    }


        
    }
}