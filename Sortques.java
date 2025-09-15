// // Give an integers array, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// public class Sortques {
    
//     public static void moveZeros(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length-i-1; j++){
//                 if (arr[j] == 0) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {3, 6, 0, 5, 0, 3, 0, 1};
//         moveZeros(arr);
//         for (int i : arr) {
//             System.out.println(i);
//         }
//     }
// }



// give an array of name of fruits, you are supposed to sort it in lexicographical order using selection sort

public class Sortques {

    public static void fruietsOrder(String fruits[]){
        for(int i=0; i<fruits.length-1; i++){

            int min_idx = i;

            for(int j=i+1; j<fruits.length; j++){

                if (fruits[j].compareTo(fruits[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_idx];
            fruits[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "papaya", "mango", "banana", "lichi", "graps"};
        fruietsOrder(fruits);
        for (String string : fruits) {
            System.out.println(string);
        }
    }
}