// //Ques. -> 🟢 Remove all occurrences from String
// // TC = O(n) and SC = O(n) but Result sirf print hota hai, use store/return nahi kar sakte. Reusable nahi hai

// public class Recursion8 {
//     public static void removeOccurrence(int idx, String str, char n){
//         if (idx == str.length()) {
//             return;
//         }
        
//         String ans = "";
//         if (str.charAt(idx) != n) {
//             ans += str.charAt(idx);
//             System.out.print(ans);
//         }
//         removeOccurrence(idx+1, str, n);
//     }

//     public static void main(String[] args) {
//         String str = "abdcabj";
//         removeOccurrence(0, str, 'a');
//     }
// }
 

            // 🟢 Method : 2 🟢 TC = O(n^2)

import java.util.Scanner;

public class Recursion8 {

    public static String removeA2(String str){
        if (str.length() == 0) return "";

        String smallAns = removeA2(str.substring(1));

        char currChar = str.charAt(0);

        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeA2(str));
    }
}