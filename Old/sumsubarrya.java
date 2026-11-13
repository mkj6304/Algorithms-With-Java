public class sumsubarrya {
    public void subarray(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum = sum + a[i] + a[j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, -4, -1, 6, 5 };
        sumsubarrya s = new sumsubarrya();
        s.subarray(a);
    }
}
