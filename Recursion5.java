// // Print sum of element in the Array

// public class Recursion5 {

//             //    🟢 Without Recursion

//     public static int printSum(int arr[]){
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum = sum + arr[i];
//         }
//         return sum;
//     }





//             //    🟢 With Recursion

//     // public static int printSum(int arr[], int idx){
//     //     if (idx == arr.length) {
//     //         return 0;
//     //     }

//     //     return arr[idx] + printSum(arr, idx+1);

//     // }

//     public static void main(String[] args) {
//         int arr[] = {3, 1, 5, 7, 3, 7};
//         System.out.println(printSum(arr));
//         // System.out.println(printSum(arr, 0));
//     }
// }
