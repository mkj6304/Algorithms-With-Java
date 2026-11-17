import java.util.*;

public class Recurs {

    void print_Name(int n) {
        if (n == 0) {
            return;
        }
        print_Name(n - 1);
        System.out.println("Mayank Kumar Jha");
    }

    void print_toN(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        print_toN(n - 1);

    }

    void reverseArray(int[] nums, int l, int r) {
        if (l >= r)
            return;

        Recurs rc = new Recurs();
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        reverseArray(nums, l + 1, r + 1);

        for (int x : nums) {
            System.out.println(x);
        }
    }

    void printF(int[] nums, int ind, List<Integer> lst, int n) {

        if (ind == n) {
            System.out.println(lst);
            return;
        }

        // Pick the element
        lst.add(nums[ind]);
        printF(nums, ind + 1, lst, n);

        // Not pick the element
        lst.remove(lst.size() - 1);
        printF(nums, ind + 1, lst, n);
    }

    public static void main(String[] args) {
        Recurs r = new Recurs();
        r.print_Name(5);
        r.print_toN(5);
        int[] arr = { 1, 8, 74, 99, 44, 11, 22, 33 };
        // int[] result = r.reverseArray(arr, 0, 0);
        // System.out.println(Arrays.toString(result));
        r.reverseArray(arr, 0, 0);
        List<Integer> lst = new ArrayList<>();
        r.printF(arr, 0, lst, arr.length);
    }

}
