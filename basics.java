import java.util.*;

public class basics {

    boolean binary_Search(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if (nums.length == 0)
            return false;

        while (low < high) {
            mid = (low + high) / 2;

            if (nums[mid] == key)
                return true;
            else if (nums[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

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

    void first_and_last_occ(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }
        System.out.println("first and last are" + first + last);
    }

    public static void main(String args[]) {
        int[] arr = { 2, 1, 4, 5, 6, 718, 9347, 88, 84 };
        basics b = new basics();
        // System.out.println(b.linearSearch(arr, 89));
        // System.out.println(b.fact(5));
        // System.out.println(b.recursiveFact(5));
        // b.fibo(7);
        /*
         * int[] res = b.bubbleSort(arr);
         * System.out.println(Arrays.toString(res));
         * List<Integer> lst = new ArrayList<>();
         * lst.add(10);
         * lst.add(20);
         * for (int x : lst) {
         * System.out.print(x + " ");
         * }
         */

        // HashMap
        int[] arr2 = { 2, 4, 4, 4, 4, 7, 9, 9, 10 };
        HashMap<String, Integer> h = new HashMap<>();
        System.out.println(b.binary_Search(arr, 9347));
        b.first_and_last_occ(arr2, 4);
    }
}
