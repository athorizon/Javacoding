import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        rotate(nums,2);
    }
    public static void printArray(int[] ar) {
        Arrays.stream(ar).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
    static void reverseArray(int[] arr, int start, int end)
    {
        while (start < end) {
            arr[start] = arr[start]+arr[end];
            arr[end] = arr[start]-arr[end];
            arr[start] = arr[start]-arr[end];
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }
        if(k>nums.length){
            k=k%nums.length;
        }
        reverseArray(nums, 0, (nums.length-k-1)%nums.length);
        reverseArray(nums, (nums.length-k)%nums.length, nums.length-1);
        reverseArray(nums,0,nums.length-1);

        printArray(nums);
    }
}
