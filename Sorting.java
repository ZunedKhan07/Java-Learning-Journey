// import java.util.*;

// public class Sorting {
//     public static void printArray (int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         int arr[] = {7,2,5,6,1};

//         //insertion sort
//         //time complexity = 0(n^2)
//         for(int i=1; i<arr.length; i++){
//             int current = arr[i];
//             for(int j=i-1; j>=0; j--){
//                 if(current < arr[j]){
//                     arr[j+1] = arr[j];
//                     arr[j] = current;
//                 }
//             }
//         }

        // //Selection Sort
        // //time complexity = 0(n^2)
        // for(int i=0; i<arr.length-1; i++){
        //     int smallest = i;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[smallest]>arr[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        // // bubble sort
        // //time complexity = 0(n^2)
        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=0; j<arr.length-i-1; j++){
        //         if (arr[j] > arr[j+1]) {
        //         int temp = arr[j];
        //         arr[j] = arr[j+1];
        //         arr[j+1] = temp;
        //         }
        //     }
        // }
//         printArray(arr);
//     }
// }
