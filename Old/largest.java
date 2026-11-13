public class largest {
    public void large(int a[]) {
        int max;
        max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("The largest element of an array is " + max);
    }

    public static void main(String[] args) {
        int a[] = { 52, 89, 44, 56, 78, 15 };
        largest s = new largest();
        s.large(a);
    }
}
