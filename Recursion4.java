// import java.lang.reflect.Array;

// public class Recursion4 {

//     static void printArr(int[] arr, int idx){
//         if (idx == arr.length) {
//             return;
//         }  System.out.println(arr[idx]);
//         printArr(arr, idx+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3 ,4, 5};
//         printArr(arr, 0);
//     }
// }



                          // print the max. value in a array
// public class Recursion4 { // T. C. = O(n) and S. C. = O(n)

//     public static int printMax(int idx){
//         int arr[] = {4, 2, 6, 7, 2, 1, 35, 29, 1, 8};
        
//         if (idx == arr.length - 1) {
//             return arr[idx];
//         }

//         int smallAns = printMax(idx + 1);

//         if (smallAns > arr[idx]) {
//             return smallAns;
//         } else return arr[idx];
        







            // 🟢 WITHOUT RECURSION  // T. C. = O(n) and S. C. = O(1)
    //     int arr[] = {1, 2, 3, 4, 5};
    //     int max = arr[0];  // start (max = 1)
    //     for(int i=0; i<arr.length; i++){
    //         if (arr[i] > max) {
    //             max = arr[i+1];
    //         }
    //     }
    //     System.out.println(max);
    //     return max;
    



// }

//     public static void main(String[] args) {
//         System.out.println(printMax(0));;
        
//     }
// }
