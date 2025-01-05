import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *45. Jump Game II
Medium
Topics
Companies
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
*/

public class JumpGame2 {

    public static int canJump(int[] num,int in,int[] jumps) {
        if (in >= num.length - 1) {
            return 0;
        }else if (num[in] == 0) {
            return Integer.MAX_VALUE;
        }
        int jump = Integer.MAX_VALUE;
        if(jumps[in]!=0){
            return jumps[in];
        }else{
        int n = num[in];
            while (n > 0) {
                int val = canJump(num, in + n, jumps);
                if(val!=Integer.MAX_VALUE){
                    jump=Math.min(val+1,jump);
                }
                n--;
            }
            jumps[in]=jump;}

            return jump;
        
    }
        

        /*
    public static boolean canJump(int[] num){
        int goal=0;
      for(int n:num){
            // System.out.println("goal: "+goal+"for i: "+i);
            if(goal<0){
                return false;
            }
            if(goal<n){
                goal=n-1;
            }else{
                goal--;
            }
        }
        return true;
    }
*/
    public static void main(String[] args){
        int[] num = new int[] {2,3,1,0,4};
        int[] jumps = new int[num.length];
        // for (int i = 0; i < jumps.length; i++) {
        //     jumps[i] = -1;
        // }
        System.out.println(canJump(num,0,jumps));
        // for (int i = 0; i < jumps.length; i++) {
        //     System.out.println(jumps[i]);
        // }
        // System.out.println(canJump(num));
    }
    
}
