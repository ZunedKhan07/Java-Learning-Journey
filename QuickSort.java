// Time Complexity (both):

// Best / Average = O(n log n)

// Worst = O(n^2)

// Space Complexity (both):

// Extra space = O(1)

// Recursion stack = O(log n) (average), O(n) (worst)



// public class QuickSort {

//     static void swap(int[] arr, int x, int y){
//         int temp = arr[x];
//         arr[x] = arr[y];
//         arr[y] = temp;
//     }

//     public static int partition(int[] arr, int st, int end){
//         int pivot = arr[st];
//         int count = 0;

//         for(int i=st+1; i<=end; i++){
//             if (arr[i] <= pivot) count++;
//         }

//         int pivotIdx = st + count;
//         swap(arr, st, pivotIdx);

//         // pivot se bade left and chote right aa jayege
//         int i=st, j=end;
//         while (i < pivotIdx && j > pivotIdx) {
//             while (arr[i] <= pivot) i++;
//             while (arr[j] > pivot) j--;
//             if (i < pivotIdx && j > pivotIdx) {
//                 swap(arr, i, j);
//                 i++;
//                 j--;
//             }
//         }

//         return pivotIdx;
//     }

//     public static void quickSort(int[] arr, int st, int end){

//         if (st >= end) return;

//         int pr = partition(arr, st, end);

//         quickSort(arr, st, pr-1);
//         quickSort(arr, pr+1, end);
//     }

//     public static void print(int[] arr){
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
    
//     public static void main(String[] args) {
//         int[] arr = {4, 2, 5, 1, 6, 13, 7, 10};
//         System.out.println("Array before Sorting");
//         print(arr);
//         quickSort(arr, 0, arr.length-1);

//         System.out.println("\nSorted Array");
//         print(arr);

//     }
// }



public class QuickSort {

    public static void quickSort(int[] arr, int st, int end, int pIdx){
        if (st >= end) return;

        int pivot = arr[st];
        int count = 0;

        for(int i=st+1; i<=end; i++){
            if (pivot >= arr[i]) count++;
        }

        int pivotIdx = st + count;

        int temp = arr[pivotIdx];
        arr[pivotIdx] = arr[st];
        arr[st] = temp;

        int i=st, j=end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (arr[i] >= pivot && arr[j] < pivot) {
                int temp2 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp2;
            } 
        }

        quickSort(arr, st, pivotIdx-1, 0);
        quickSort(arr, pivotIdx+1, end, 0);
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 8, 1, 9};
        quickSort(arr, 0, arr.length-1, 0);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}