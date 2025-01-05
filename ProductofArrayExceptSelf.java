/**
 * 238. Product of Array Except Self
Medium
Topics
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
 */

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int i=1;
        int[] pre = new int[nums.length];
        pre[0]=nums[0];
        int[] post = new int[nums.length];
        post[nums.length-1]=nums[nums.length-1];
        while(i<nums.length-1){
            pre[i]=pre[i-1]*nums[i];
            i++;
        }
        i--;
        while(i>0){
            post[i]=post[i+1]*nums[i];
            i--;
        }
        // System.out.println("pre: "+Arrays.toString(pre));
        // System.out.println("post: "+Arrays.toString(post));
        while(i<nums.length){
            if(i==0){
                nums[i]=post[i+1];
            }else if(i==nums.length-1){
                nums[i]=pre[i-1];
            }else{
                nums[i]=pre[i-1]*post[i+1];
            }
            i++;
        }
        return nums;
        
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    
}
