public class sorting {

    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionsort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minpos] > a[j]) {
                    minpos = j;
                }
                int temp = a[minpos];
                a[minpos] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void insertionsort(int a[]){
        for(int i=1; i<a.length; i++){
            int curr = a[i];
            int prev = i-1:
            while(prev>=0 && curr>prev){
                prev[i+1]=prev;
                prev--;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 5, 4, 1, 3, 2 };
        selectionsort(a);
        printArr(a);

    }

}
