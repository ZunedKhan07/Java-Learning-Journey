//  subsets
import java.util.*;

import java.util.ArrayList;

public class Recursion2 {

    public static void printSubset(ArrayList <Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.println(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset){
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // add hoga
        subset.add(n);
        findSubset(n-1, subset);

        // add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}


// // placed tiles in a frush m*n.

// public class Recursion2 {

//     public static int placeTiles(int m, int n){
//         if (n == m) {
//             return 2;
//         }

//         if (m<n) {
//             return 1;
//         }

//         // vertically
//         int verPlacemeent = placeTiles(m-n, n);

//         // Horizontally
//         int horPlacement = placeTiles(m-1, n);

//         return verPlacemeent + horPlacement;
//     }

//     public static void main(String args[]){
//         System.out.println(placeTiles(4, 2));
//     }
// }



// // ques.(imp) : Permutation
// public class Recursion2 {

//     public static void printPerm(String str, String permutation){
//         if (str.length() == 0) {
//             System.out.println(permutation);
//         }

//         for(int i=0; i<str.length(); i++){
//             char currChar = str.charAt(i);
//             // "abc" -> "ab"
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             printPerm(newStr, permutation+currChar);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         printPerm(str, "");
//     }
// }


// import java.util.HashSet;

// // ques(imp). : Subsequences and timeComplesity = 2^n + 2^n-1 + .... + 1 => 2^n
// public class Recursion2 {

//     // public static void Subsequences(String str, int idx, String newString){
//     //     if (idx == str.length()) {
//     //         System.err.println(newString);
//     //         return;
//     //     }

//     //     char currChar = str.charAt(idx);
         
//     //     // to be
//     //     Subsequences(str, idx+1, newString+currChar);

//     //     // not to be
//     //     Subsequences(str, idx+1, newString);
//     // }

//     // public static void main(String args[]){
//     //     String str = "abc";
//     //     Subsequences(str, 0, "");
//     // }


//     // if (String str = "aaa") char are same then we will use Hashset.

//                 //  🟢 HASHSET
            
    
//     public static void Subsequences(String str, int idx, String newString, HashSet<String> set){
//         if (idx == str.length()) {
//             if (set.contains(newString)) {
//                 return;
//             } else {
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }

//         char currChar = str.charAt(idx);
         
//         // to be
//         Subsequences(str, idx+1, newString+currChar, set);

//         // not to be
//         Subsequences(str, idx+1, newString, set);
//     }

//     public static void main(String args[]){
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         Subsequences(str, 0, "", set);
//     }
// }




// // ques. : keypad mobile numcombinationf
// public class Recursion2 {

//     public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

//     public static void printKeypadComp(String str, int idx, String combination){

//         if (idx == str.length()) {
//             System.out.println(combination);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         String mapping = keypad[currChar - '0'];

//         for(int i=0; i<mapping.length(); i++){
//             printKeypadComp(str, idx+1, combination+mapping.charAt(i));
//         }
//     }

//     public static void main(String[] args) {
//         String str = "07";
//         printKeypadComp(str, 0, "");
//     }
// }




// public class Recursion2 {
//     public static boolean[] map = new boolean[26]; // static likhne se hum func me map ko bina parameter liye use kar payenge

//     public static void removeDuplicates(String str, int idx, String newString){

//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }

//         char currentChar = str.charAt(idx);
//         if(map[currentChar-'a']){
//             removeDuplicates(str, idx+1, newString);
//         } else {
//             newString += currentChar;
//             map[currentChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newString);
//         }
//     }

//     public static void main(String args[]){
//         String str = "aabbfmskkkmda";
//         removeDuplicates(str, 0, "");
//     }




//     // public static boolean isSorted(int arr[], int idx){
//     //     if(idx == arr.length-1){
//     //         return true;
//     //     }

//     //     if(arr[idx] < arr[idx+1]){
//     //         // array is sorted till now
//     //         return isSorted(arr, idx+1);
//     //     } else {
//     //         return false;
//     //     }
//     // }
//     // public static void main(String args[]){
//     //     int arr[] = {1, 3, 5, 6};
//     //     System.out.println(isSorted(arr, 0));
//     // }
// }





// // public class Recursion2{
// //     public static int first = -1;
// //     public static int last = -1;

// //     public static void findOccurance(String str, int idx, char elem){
// //         if(idx == str.length()){
// //             System.out.println(first);
// //             System.out.println(last);
// //             return;
// //         }
// //         char currChar = str.charAt(idx);
// //         if (currChar == elem) {
// //             if(first == -1){
// //                 first = idx;
// //             } else {
// //                 last = idx;
// //             }
// //         }
        
// //         findOccurance(str, idx+1, elem);
// //     }
// //     public static void main(String args[]){
// //         String str = "ajndsjidanmcjkkzxak";
// //         findOccurance(str, 0, 'a');
// //     }
// // }


// // public class Recursion2{
// //     // Revres String
// //     public static void printRev(String str, int idx){
// //         if (idx == 0) {
// //             System.out.println(str.charAt(idx));
// //             return;
// //         }
// //         System.out.print(str.charAt(idx));
// //         printRev(str, idx-1);
// //     }
// //     public static void main(String args[]){
// //         String str = "abcde";
// //         printRev(str, str.length()-1);
// //     }
// //   }





// // // Ques.1 : Tower of Hanoi.
// // // Rules:
// // // 1. Only one disk transferred in 1 step
// // // 2. Smaller disks are always kept on top of larger disk.
// // // TimeComplesity : 2^n 

// // public class Recursion2 {

// //     public static void towerOfHanoi(int n, String src, String helper, String dest){
// //         if(n == 1){
// //         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
// //         return;
// //         }
// //         towerOfHanoi(n-1, src, dest, helper);  
// //         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
// //         towerOfHanoi(n-1, helper, src, dest);
// //     }
// //     public static void main(String[] args){
// //         towerOfHanoi(3, "S", "H", "D");
// //     }    
// // }
