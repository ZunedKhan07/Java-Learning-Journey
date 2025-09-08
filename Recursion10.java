//              // 🟢-->Ques. : 1 :- print Subsequences as a ArrayList <--🟢  // SC : 2^n
//              // 🟢-->Ques. : 2 :- print Subsequences as without any space(Void) <--🟢 
//              // 🟢-->Ques. : 3 :- Given array if itn., print sum of all subsets <--🟢 


// import java.util.ArrayList;

// public class Recursion10 {
    
//     static ArrayList<String> printScc(String str){
//         ArrayList<String> ans = new ArrayList<>();

//         if (str.length() == 0) {
//             ArrayList<String> base = new ArrayList<>();
//             base.add("");
//             return base;
//         }

//         char ch = str.charAt(0);

//         ArrayList<String> smallAns = printScc(str.substring(1));

//         for(String s : smallAns){
//             ans.add(ch + s);
//             ans.add(s);
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         System.out.println(printScc("abc"));;
//     }
// }



//   v.imp.          // 🟢-->Ques. : 2 :- print Subsequences as without any space(Void) <--🟢 
//  SC : n^2


// public class Recursion10 {

//     public static void printSub(String str, String currAns){

//         if (str.length() == 0) {
//             System.out.println(currAns);
//             return;
//         }
        
//         char curr = str.charAt(0);

//         printSub(str.substring(1), currAns + curr); // charactor added 
//         printSub(str.substring(1), currAns); // without charactor added 
//     }

//     public static void main(String[] args) {
//         printSub("abc", "");
//     }
// }




//              // 🟢-->Ques. : 3 :- Given array if itn., print sum of all subsets <--🟢 


// public class Recursion10 {

//     public static void subsetSum(int[] num, int currSum, int idx, int n){

//     if (idx >= n) {
//         System.out.println(currSum);
//         return;
//     }

//     subsetSum(num, currSum + num[idx], idx+1, n);
//     subsetSum(num, currSum, idx+1, n);
//     }

//     public static void main(String[] args) {
//         int num[] = {1, 2, 3};
//         subsetSum(num, 0, 0, num.length);
//     }
// }