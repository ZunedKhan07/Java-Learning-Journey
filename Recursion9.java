//Ques.1 : Reverse of a String
// Ques.2 : Check for palindrome


// public class Recursion9 {
//     public static String printReverse(String str, int idx){
//         if (str.length() == idx) {
//             return "";
//         }
//         return printReverse(str, idx+1) + str.charAt(idx);
//     }

//     public static void main(String[] args) {
//         String str = "abcde";
//         System.out.println(printReverse(str, 0));
//     }
// }

// import java.util.Scanner;

// public class Recursion9 {
       
//         public static String printString2(String str){
//             if (str.isEmpty()) return "";

//             String smallAns = printString2(str.substring(1));
//             return smallAns + str.charAt(0);
//         }

//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             String str = sc.nextLine();

//             System.out.println(printString2(str));;
//         }
// }




        //    Ques.2 : Palimdrome 🟢 TC = O(n^2)

// public class Recursion9 {

//     public static boolean palimdrome(String str, int start, int end){
//           if (start >= end) {
//             return true;
//           }

//           if (str.charAt(start) != str.charAt(end)) {
//             return false;
//           }

//           return palimdrome(str, start+1, end-1);
//     }

//     public static void main(String[] args) {
//         String str = "naan";
//         if (palimdrome(str, 0, str.length()-1)) {
//             System.out.println("String is a Palindrom");
//         } else {
//             System.out.println("String is not a Palindrom");
//         }
//     }
// }

            //   Method : 2 TC = O(n)

public class Recursion9 {

        public static String printString2(String str){
            if (str.isEmpty()) return "";

            String smallAns = printString2(str.substring(1));
            return smallAns + str.charAt(0);
        }

        public static void main(String[] args) {
            String str = "nanan";
            String rev = printString2(str);

            if (rev.equals(str)) {
                System.out.println("Palimdrome");
            } else {
                System.out.println("Not a Palimdrome");
            }
        }
}