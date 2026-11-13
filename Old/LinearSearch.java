import java.util.Scanner;

public class LinearSearch {
    public void search(int a[], int key) {
        int l = a.length;
        int flag = 0;
        for (int i = 0; i < l; i++) {
            if (a[i] == key) {
                flag = 1;
            }

        }
        if (flag == 1) {
            System.out.println("Key Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public static void main(String args[]) {
        int key;
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the key you want to search in the array");
        key = s.nextInt();
        LinearSearch ls = new LinearSearch();
        ls.search(a, key);
    }
}
