import java.util.*;

public class Matrices {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {

                    System.out.println("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    /*
     * public static void printSpiral(int matrix[][]){
     * while (condition) {
     * //top layer
     * for (var each : collection) {
     * 
     * }
     * 
     * //right side
     * for (var each : collection) {
     * 
     * }
     * 
     * //bottom layer
     * for (var each : collection) {
     * 
     * }
     * 
     * //left layer
     * for (int l=0; l<0; l++) {
     * 
     * }
     * }
     * }
     */

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        // taking input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);

    }
}
