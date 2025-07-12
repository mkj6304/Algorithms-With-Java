public class Patterns {
    public static void print1(int n) {
        for (int i = 0; i <= n; i++) {
            // space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // pattern
            for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print2(int n) {
        for (int k = 0; k < n; k++) {
            // space
            for (int i = 0; i < n - k - 1; i++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * k + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int i = 0; i < n - k - 1; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print4(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == n - 1) {
                    for (j = n; j > i; j--) {
                        System.out.print("*");
                        break;
                    }
                }
            }
            System.out.println("*");
        }
    }

    public static void print3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void print5(int n) {
        for (int k = 0; k < n; k++) {
            // space
            for (int i = 0; i < n - k - 1; i++) {
                System.out.print(" ");
            }
            // star
            char ch = 'A';
            int breakpoint = (2 * k) / 2;
            for (int j = 0; j < 2 * k + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) {
                    System.out.print(ch--);
                } else {
                    System.out.print(ch++);
                }
            }

            // space
            for (int i = 0; i < n - k - 1; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print5(n);

    }

}
