/** Question 27 : Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted,
 you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which 
are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
**/

public class RemoveElement {
    public static void main(String arg[]){
        int nums[] = {1,4,2,3,4,6,4,7};
        int k = removeElement(nums,4);
        System.out.print("arr : [");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+",");
        }
        System.out.print("]");
    }

    public static int removeElement(int[] nums, int val) {
        int i=0,k=nums.length-1;
        while(i<=k){
            if(nums[i]==val){
                nums[k]=nums[i]+nums[k];
                nums[i]=nums[k]-nums[i];
                nums[k]=nums[k]-nums[i];
                k--;
            }else{
                i++;
            }
        }
        return i;  
    }

}
