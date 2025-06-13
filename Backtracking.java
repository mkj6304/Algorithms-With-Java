public class Backtracking {

    public static void changeArr(int arr[], int i, int val) {
        if (i == arr.length - 1) {
            printArr(arr);
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // Function Step
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
