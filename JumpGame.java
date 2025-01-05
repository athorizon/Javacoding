import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 55. Jump Game
Medium
Topics
Companies
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */

public class JumpGame {

    /*
    public static boolean canJump(int[] num,int in,Map<Integer,Boolean> pre) {
        if (in >= num.length - 1) {
            return true;
        } else if (num[in] == 0) {
            return false;
        }
        Boolean res = false;
        if (pre.get(in) != null) {
            return pre.get(in);
        } else {
            int n = num[in];

            while (n > 0) {
                res = res || canJump(num, in + n, pre);
                n--;
            }
            pre.put(in, res);
        }

        return res;
    }
        */

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

    public static void main(String[] args){
        int[] num = new int[] {2,5,0,0};
        Map<Integer,Boolean> checkMap= new HashMap<>();
        // System.out.println(canJump(num,0,checkMap));
        System.out.println(canJump(num));
    }
    
}
