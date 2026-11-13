public class Recursion {
    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printinc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int sumon(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumon(n - 1);
        return sum;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fb = fnm1 + fnm2;
        return fb;
    }

    public static int firstoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int ans = x * pow(x, n - 1);
        return ans;
    }

    public static int optiPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optiPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;

    }

    public static void main(String args[]) {
        // int n = 10;
        int arr[] = { 8, 9, 5, 6, 4, 2, 6, 7 };
        // printinc(n);
        // System.out.println(fact(n));
        // System.out.println(sumon(n));
        // System.out.print(fib(n));
        // System.out.print(lastOccurence(arr, 6, 0));
        System.out.println(optiPower(2, 11));

    }
}
