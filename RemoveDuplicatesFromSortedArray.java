/** Question 26 : Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates 
in-place such that each unique element appears only once. The relative order of the
elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to 
do the following things:

Change the array nums such that the first k elements of nums contain the unique elements
 in the order they were present in nums initially. The remaining elements of nums are not
  important as well as the size of nums.

Return k.


Question 80: Remove Duplicates from Sorted Array II
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place
such that each unique element appears at most twice. The relative order of the elements
should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead
have the result be placed in the first part of the array nums. More formally, if there are k
elements after removing the duplicates, then the first k elements of nums should hold the
final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying
the input array in-place with O(1) extra memory.
**/


public class RemoveDuplicatesFromSortedArray {

    public static void main(String arg[]){

        // int[] nums = {0,0,1,1,1,1,2,3,3};
        int[] nums = {1,2,3,4,5,6};
        int k= removeDuplicates2(nums);
        for(int i=0;i<=k;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        
        int i=0, j=0, k=0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[k+1]=nums[j];
                k++;
                i=j;
            }
        }
        return k;
    }

    public static int removeDuplicates2(int[] nums) {
        
        int i=0, j=0, k=0;
        while(i<nums.length){
            if(j<nums.length && nums[i]==nums[j]){
                j++;
            }else{
                nums[k]=nums[i];
                if(i<nums.length-1)
                    nums[k+1]=nums[i+1];
                if(j-i==1){
                    k=k+1;
                }else{
                    k=k+2;
                }
                i=j;
            }
        }return k;

        /**
         * int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0 || cnt == 1 || nums[cnt - 2] != nums[i]) {
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
         */
        // if(j-i==1){
        //     return k;
        // }
        // return k+1;
    }
}
