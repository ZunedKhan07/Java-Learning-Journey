public class QuickSort {

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;

        for(int i=st+1; i<=end; i++){
            if (arr[i] <= pivot) count++;
        }

        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);

        // pivot se bade left and chote right aa jayege
        int i=st, j=end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    public static void quickSort(int[] arr, int st, int end){

        if (st >= end) return;

        int pr = partition(arr, st, end);

        quickSort(arr, st, pr-1);
        quickSort(arr, pr+1, end);
    }

    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 6, 13, 7, 10};
        System.out.println("Array before Sorting");
        print(arr);
        quickSort(arr, 0, arr.length-1);

        System.out.println("\nSorted Array");
        print(arr);

    }
}
