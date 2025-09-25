// public class countSort {

//     public static void basicCountSort(int[] arr, int st, int end){
//         // Find largest element in the arr
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length-1; i++){
//             if (arr[i] > max) {
//                 max =  arr[i];
//             }
//         }

//         int[] count = new int[max+1];
//         for(int i=0; i < arr.length; i++){
//             count[arr[i]]++;
//         }
//         int k = 0;
//         for(int i=0; i<count.length; i++){
//             for(int j=0; j<count[i]; j++){
//                 arr[k++] = i;
//             }
//         }
//     }

//     static void display(int[] arr){
//         for (int i : arr) {
//             System.out.println(i);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {4, 3, 5, 1, 9, 2};

//         basicCountSort(arr, 0, arr.length);

//         display(arr);
//     }
// }


// isse stability nhi rehti and obj. nhi kr sakte isliye isko extend krni padti hai


//                    🟢 Method - 2 🟢     // TC = n + max --> if(n >>>>> max) then TC = O(n)  & SC = n+k


public class countSort {

    static int findMax(int[] arr){
        // Find largest element in the arr
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > max) {
                max =  arr[i];
            }
        }
        return max;
    }

    static void display(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i=0; i < n; i++){ // Make frequency array   // TC --> n
            count[arr[i]]++;
        }
        // Make prefix sum array of count array
        for(int i=1; i < count.length; i++){  // TC --> max
            count[i] += count[i-1];
        }

        // Find the index of each elem in the original arr and put it in output arr
        for(int i = n-1; i >= 0; i--){  // TC --> n
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all elem of output to arr
        for(int i=0; i<n; i++){ // TC --> n
            arr[i] = output[i];
        }
    }

        public static void main(String[] args) {
        int arr[] = {4, 3, 5, 1, 9, 2};

        countSort(arr);

        display(arr);
    }
}