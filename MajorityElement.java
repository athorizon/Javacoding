import java.util.HashMap;
import java.util.Map;

/**
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.

 **/

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Map<Integer, Integer> cmap = new HashMap<>();
        int max=-1;
        int current;
        for(int num:nums){
            if(cmap.containsKey(num)){
                current = cmap.get(num)+1;
                cmap.replace(num,current);
                if(max<0){
                    max=num;
                }
                if(cmap.get(max)<current){
                    max=num;
                }
            }else{
                cmap.put(num,1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
    }
}
