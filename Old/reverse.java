public class reverse {
    public void rev(int a[]) {
        int l, temp;
        l = 0;
        temp = 0;
        l = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[l - i];
            a[l - i] = a[i];
            a[i] = temp;

        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        reverse r = new reverse();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        r.rev(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
