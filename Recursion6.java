// search an Integer     🟢---> LINEAR SEARCH <---🟢

                // 🟢 With Racursion

// public class Recursion6 {

//     public static int searchInt(int n, int arr[], int idx){

//         if (idx == arr.length) {
//             return -1;
//         }

//         if (arr[idx] == n) return idx;

//         return searchInt(n, arr, idx+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 4, 6, 3, 7, 3, 7};
//         int result = searchInt(7, arr, 0);

//         if (result != -1) {
//             System.out.println("Element found at index: " + result);
//         } else {
//             System.out.println("Element not found!");
//         }
//     }






                  
    //             //  🟢 Without Recursion

    // public static int printInt(int n, int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         if (n == arr[i]) {
    //             System.out.println(i);
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1, 2, 3, 4, 5, 4, 6, 1}; 
    //     printInt(1, arr);
    // }
// }






            //   🟢 if no. is same in multiples idx then all idx print 🟢

// public class Recursion6 {

//     public static void printEvery_idx(int n, int [] arr, int idx){
//         if (idx == arr.length) {
//             return;
//         }

//         if (arr[idx] == n) {
//             System.out.println(idx);
//         }

//         printEvery_idx(n, arr, idx+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 3, 4, 2, 6, 2, 5, 8, 2, 1};
//         printEvery_idx(2, arr, 0);
//     }
// }



        //    🟢 Logic Test (void ke idx print krna )
        // Function sirf print karega, value ko use nahi kar paayega.
        //  Example: Agar tu index ko kisi aur calculation me use karna chahe, possible nahi hai.

// public class Recursion6 {

//     public static void findFirstIndex(int n, int[] arr, int idx) {
//     if (idx == arr.length) return ;   // nahi mila
//     if (arr[idx] == n) {
//         System.out.println(idx);
//         return;
//     }
//     findFirstIndex(n, arr, idx+1); 
// }

//     public static void main(String[] args) {
//         int arr[] = {2, 4, 5, 2, 6, 4, 7};
//         findFirstIndex(4, arr, 0);
//     }
// }


                //  🟢--> Return ArrayList <--🟢 

import java.util.ArrayList;

public class Recursion6 {

    public static ArrayList<Integer> allIndices(int[] arr, int n, int target, int idx){
        if (idx >= n) {
            return new ArrayList<Integer>(); // return empty arrayList
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // self work
        if (arr[idx] == target) {
            ans.add(idx);  // only uss idx ke liye ans dega
        }

        // Recursive Work
        ArrayList<Integer> smallAns = allIndices(arr, n, target, idx+1);
        ans.addAll(smallAns); // jis call se add ke dwara ans diye gaye hai unko add krega 
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 4, 3, 4, 5};
        int target = 4;
        int n = arr.length;
        ArrayList<Integer> ans = allIndices(arr, n, target, 0);
        for(Integer i: ans){
            System.out.println(i);
        }
    }
}