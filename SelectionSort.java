//  TC for all cases = O(n^2)
// Selection Sort is a unstable alg.
// inplace alg. yes




// public class SelectionSort {
    
//     public static void selectionSort(int[] arr){
//         int n = arr.length;

//         for(int i=0; i<n-1; i++){ // i represent the current index
//             // Find the min elem unsorted part of arr
//             int min_idx = i;
//             for(int j=i+1; j<n; j++){
//                 if (arr[j] < arr[min_idx]) {
//                     min_idx = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[min_idx];
//             arr[min_idx] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 2, 5, 3, 1, 8};
//         selectionSort(arr);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }



//        🟢 With Recursion


public class SelectionSort {
    
    public static void selectionSort(int[] arr, int idx){
        int n = arr.length;

            int min_idx = idx;
            for(int j=idx+1; j<n; j++){
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[min_idx];
            arr[min_idx] = temp;
        }

    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 3, 1, 8};
        selectionSort(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
