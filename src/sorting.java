import java.util.Arrays;

public class sorting {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 42, 22, 3, 97};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

