// search an Integer     🟢---> LINEAR SEARCH <---🟢

                // 🟢 With Racursion

public class Recursion6 {

    public static int searchInt(int n, int arr[], int idx){

        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == n) return idx;

        return searchInt(n, arr, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 3, 7, 3, 7};
        int result = searchInt(7, arr, 0);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found!");
        }
    }






                  
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
}
