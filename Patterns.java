public class Patterns {

    void right_angled_triangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void numbered_Triangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    void inverted_Triangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void inv_right_angled_triangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // space
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * void rev_pyramid(int n){
     * for(int i=0; i<n; i++){
     * //space
     * for(int j=)
     * //star
     * 
     * //space
     * }
     * }
     */

    public static void main(String args[]) {
        /*
         * for (int i = 0; i < 4; i++) {
         * for (int j = 0; j < 4; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         */
        Patterns p = new Patterns();
        /*
         * p.right_angled_triangle();
         * p.numbered_Triangle();
         * p.inverted_Triangle();
         * p.inv_right_angled_triangle();
         */
        p.pyramid(5);
    }
}
