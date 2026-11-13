import java.util.*;

public class basics {

    /*
     * boolean binarySearch(int[] nums, int key){
     * int mid = nums.length/2;
     * Arrays.sort(nums);
     * while(mid<nums.length && mid>=0){
     * 
     * }
     * 
     * 
     * }
     */

    /*
     * void fibo(int terms) {
     * for(int i=0; i<terms; i++){
     * print(i)
     * }
     * }
     */

    int[] bubbleSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;

                }
            }
        }
        return nums;
    }

    int recursiveFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * recursiveFact(n - 1);
    }

    int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    boolean linearSearch(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 1, 4, 5, 6, 718, 9347, 88, 84 };
        basics b = new basics();
        // System.out.println(b.linearSearch(arr, 89));
        // System.out.println(b.fact(5));
        // System.out.println(b.recursiveFact(5));
        // b.fibo(7);
        int[] res = b.bubbleSort(arr);
        System.out.println(Arrays.toString(res));
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        for (int x : lst) {
            System.out.print(x + " ");
        }
    }
}
