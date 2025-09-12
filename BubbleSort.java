// // BubbleSort ka means hota hai ki adjustent elem ko swap krte rhe jab tk wo sorted na ho jaye
// // BubbleSort ka time complexity O(n^2) and space comp. O(1) hota hai
// worst case me hum n(n-1)/2 swap krenge


// stable sort : {3, 2, 5, 2, 5'} --> {2, 2, 3, 5, 5'}
// Unstable sort : {3, 2, 5, 2, 5'} --> {2, 2, 3, 5', 5}

// Bubble Sort is a stable sort alg.
// Bubble Sort is a in place alg.. kyuki new arr nhi bna rhe


// public class BubbleSort {
    
//     public static void bubSort(int[] arr, int idx) {
        

//         for(int i=0; i<arr.length - idx; i++){

//             if (i == arr.length-1) {
//                 return;
//             }

//             if (arr[i] > arr[i+1]) { 
//                 int temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = temp;
//             }
//         }
//         bubSort(arr, idx+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 1, 6, 2, 7};
//         bubSort(arr, 0);
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



// public class BubbleSort {

//     public static void bubSort2(int[] arr){
//         for(int i=0; i<arr.length-1;  i++){

//             for(int j=0; j<arr.length-i-1; j++){
//                 if (arr[j] > arr[j+1]) { 
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 4, 6, 2, 6};
//         bubSort2(arr);
//         for(int i : arr){
//             System.out.println(i + " ");
//         }
//     }
// }





//               🟢 Optimised Bub. Sort
//  Worst case : O(n^2) ans best case : O(n) --> {1, 2, 3, 4, 5}


// public class BubbleSort {

//     public static void bubSort2(int[] arr){
//         for(int i=0; i<arr.length-1;  i++){

//             boolean flag = false;

//             for(int j=0; j<arr.length-i-1; j++){

//                 if (arr[j] > arr[j+1]) { 
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;

//                 flag = true;
//                }
//                if (flag == false) {
//                 return;
//                }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 1, 3, 4, 5};
//         bubSort2(arr);
//         for(int i : arr){
//             System.out.println(i + " ");
//         }
//     }
// }
