import java.util.*;

public class Arrys {
    int[] reverse_array(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    // Palindrome check
    boolean palindrome_Check(String st) {
        int left = 0;
        int right = st.length() - 1;

        while (left < right) {
            if (st.charAt(left) != st.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    void postitioning(int[] nums) {
        int max = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                mid = max;
                max = nums[i];
            } else if (nums[i] > mid && nums[i] != max) {
                mid = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Largest:" + max + " " + "Second Largest:" + mid + " " + "Smallest:" + min);
    }

    void freq_Count(int nums[]) {
        HashMap<Integer, Integer> hp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hp.put(nums[i], hp.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(hp);

    }

    char strings1(String st) {
        char ans;
        char[] c = st.toCharArray();
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1])
                continue;
            return c[i];
        }
        return 'n';

    }

    static int[] remove_Duplicates(int[] nums) {

        List<Integer> lst = new ArrayList<>();

        for (int x : nums) {
            if (!lst.contains(x)) {
                lst.add(x);
            }
        }

        // Convert ArrayList into int[]
        int[] result = new int[lst.size()];

        for (int i = 0; i < lst.size(); i++) {
            result[i] = lst.get(i);
        }

        return result;
    }

    void fibonacci(int terms) {
        int a = 0;
        int b = 1;
        int c = a + b;

        if (terms == 0) {
            System.out.println("No terms");
        }

        System.out.println(a + " " + b + " ");

        for (int i = 2; i < terms; i++) {
            c = a + b;
            System.out.print(c);
            a = b;
            b = c;
        }
    }

    int gcd(int a, int b) {
        int ans = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    void numeric_Ops(int n) {
        // sum of digits
        int fst = n;
        int scd = n;
        int thd = n;
        int sum = 0;
        int rev = 0;
        int arm = 0;
        while (fst > 0) {
            int ldigit = fst % 10;
            sum = sum + ldigit;
            fst = fst / 10;
        }

        System.out.println("The sum of digits of the given number:" + sum);

        // reverse a number
        while (scd > 0) {
            int ldgt = scd % 10;
            rev = rev * 10 + ldgt;
            scd = scd / 10;
        }

        System.out.println("Reverse of the given number is:" + rev);

        // Armstrong condition
        while (thd > 0) {
            int ld = thd % 10;
            arm = arm + ld * ld * ld;
            thd = thd / 10;
        }
        if (arm == n) {
            System.out.println("The given number is a Armstrong Number");
        } else
            System.out.println("Not an Armstrong number");
    }

    void count_Alphabets(String st) {
        char[] c = st.toCharArray();
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                vowels++;
            } else
                consonant++;
        }
        String s = new String(c);
        System.out.println(s);
        System.out.println("The number of vowels in the given string:" + vowels);
        System.out.println("The number of consonants in the given String:" + consonant);
    }

    void bubbleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int x : nums)
            System.out.print(x + " ");
    }

    void reverseString(String name) {
        Stack<Character> st = new Stack<>();
        char[] n = name.toCharArray();
        for (int i = 0; i < n.length; i++) {
            st.push(n[i]);
        }
        for (int j = 0; j < n.length; j++) {
            System.out.println(st.pop());
        }
    }

    public static void main(String args[]) {
        int[] arr = { 12, 28, 34, 58, 58, 58 };
        int[] arr1 = { 25, 9888, 88, 44, 84 };
        Arrys a = new Arrys();
        /*
         * a.reverse_array(arr);
         * for (int i : arr) {
         * System.out.println(i);
         * }
         * // System.out.println(a.palindrome_Check(str));
         * a.postitioning(arr);
         * a.freq_Count(arr);
         * System.out.println(a.strings1("aaabcdf"));
         */
        /*
         * int[] result = remove_Duplicates(arr);
         * System.out.println(Arrays.toString(result));
         * Scanner s = new Scanner(System.in);
         * // int t = s.nextInt();
         * // a.fibonacci(t);
         * System.out.println(a.gcd(18, 12));
         * a.numeric_Ops(153);
         * a.count_Alphabets("Mayank");
         * a.bubbleSort(arr1);
         */
        a.reverseString("Mayank");
        Integer z = new Integer(0);
        System.out.println(z);
    }

    /*
     * class Node{
     * int data;
     * Node next;
     * 
     * Node(int data){
     * this.data = data;
     * this.next = null;
     * }
     * 
     * class LinkedList{
     * Node head;
     * }
     * }
     */

}
