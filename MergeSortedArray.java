
/** Question 88 : Merge sorted array
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, 
but instead be stored inside the array nums1. To accommodate this, 
nums1 has a length of m + n, where the first m elements denote the 
elements that should be merged, and the last n elements are set to 0 and should be ignored.
 nums2 has a length of n.
 **/

import java.util.*;

public class MergeSortedArray {
    public static void main(String arg[]) {
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        printArray(merge(nums1, 0, nums2, 1));
    }

    public static void printArray(int[] ar) {
        Arrays.stream(ar).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] nums = new int[m+n];
        // int i=0, j=0;

        // while(i<m && j<n){
        //     System.out.println("nums1 : ");
        //     printArray(nums1);
        //     System.out.println("nums2 : ");
        //     printArray(nums2);
        //     System.out.println("i: "+i+" j: "+j);
        //     if(nums1[i]<=nums2[j]){
        //         i++;
        //     }else{
        //         int k=m;
        //         System.out.println("k before starting shift : "+k);
        //         while(k>i){
        //             System.out.println("swapping nums1[k-1] : "+nums1[k-1]+" -> nums1[k] : "+nums1[k]);
        //             nums1[k]=nums1[k-1];
        //             k--;
        //             printArray(nums1);
        //             // System.out.println("k : "+k);    
        //         }
        //         // printArray(nums1);
        //         nums1[i++]=nums2[j++];
        //         m++;
        //     }
        //     System.out.println();
        // }
        // if(j<n){
        //     while(j<n){
        //         nums1[i++]=nums2[j++];
        //     }
        // }

        int i=m-1,j=n-1,k=m+n-1;

        while(j>=0){
            System.out.println("i: "+i+" j: "+j+" k: "+k);
            // if(i>=m || j>=n)
            //     break;
            if(i>=0){
                nums1[k--] = nums1[i]<nums2[j]?nums2[j--]:nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        // System.out.println("loop end : "+i+"|"+j+"|"+k);
        // if(i<m){
        //     while(i<m){
        //         System.out.println("i : "+i+" k: "+k);
        //         nums1[k++]=nums1[i++];
        //     }
        // }else{
        //     while(j<n){
        //         System.out.println("j : "+j+" k: "+k);
        //         nums1[k++]=nums2[j++];
        //     }
        // }
        return nums1;
    }
}
