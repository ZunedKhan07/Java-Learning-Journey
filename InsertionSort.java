//  TC for werst cases = O(n^2) or best case O(n) and cont. space
// Selection Sort is a stable alg.
// inplace alg. yes


public class InsertionSort {
    public static void inserSort(int[] arr){

        for(int i=1; i < arr.length; i++){
            int j = i;

            while (j > 0 && arr[j] < arr[j-1]) {

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 6, 8, 1, 2, 0};

        inserSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
