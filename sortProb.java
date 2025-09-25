//Ques.1 :- give an array where all its elements sorted in increasing order except two elements, 
// swap those two elements and return the array to its original sorted order.



public class sortProb {

    public static int[] sorting(int[] arr){
        int x = -1, y = -1;

        if (arr.length <= 1) {
            return arr;
        }
        
        for(int i=0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]) {
               if (x == -1) {
                x = i;
                y = i+1;
               } else {
                 y = i+1;
                 break;
               }
            }
        }
         if (x != -1 && y != -1) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
         }
         return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};

        sorting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
