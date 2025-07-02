// public class Recursion1 {

//     public static int calPower(int x, int n){
//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         // int xPowermn = calPower(x, n-1);
//         // int xPowern = x * xPowermn;
//         // return xPowern;

//         // with stack heigth = log(n)s
//         // n is even
//        if (n % 2 == 0) {
//         return calPower(x, n/2)*calPower(x, n/2);
//        } else {
//         // n iss odd
//         return calPower(x, n/2)*calPower(x, n/2) * x;
//        }
//     }

//     public static void main(String args[]){

//         System.out.println(calPower(2, 5));
//     }


//     // Fibonacci Series
//     // public static void printFibo(int a, int b, int n){
//     //     if (n == 0) return;
        
//     //     int c = a+b;
//     //     System.out.println(c);
//     //     printFibo(b, c, n-1);
//     // }
//     // public static void main(String args[]){
//     //     int a =0;
//     //     int b = 1;
//     //     int n = 7;
//     //      System.out.println(a);
//     //     System.out.println(b);
//     //     printFibo(0, 1, n-2);
//     // }


//     // public static int calFact(int n){
//     //     if (n == 1 || n == 0){
//     //         return 1;
//     //     }
//     //     int fact_nm1 = calFact(n-1);
//     //     int fact_n = n*fact_nm1;
//     //     return fact_n;
//     // }
//     // public static void main(String[] args){
//     //     System.out.println(calFact(6));;
//     // }

//     // public static void sumNum(int i, int n, int sum){
//     //     if(i == n){
//     //         sum += i;
//     //         System.out.println(sum);
//     //         return;
//     //     }
//     //     sum += i;
//     //     sumNum(i+1, n, sum);
//     // }
//     // public static void main(String[] args){
//     //     sumNum(1, 5, 0);
//     // } 



//     // public static void printNum(int n){
//     //     if(n == 6){
//     //         return;
//     //     }
//     //     System.out.println(n);
//     //         printNum(n+1);
//     // }

//     // public static void main(String[] args){
//     //     int n=1;
//     //     printNum(n);
//     // }
// }



// // public class Recursion1 {
// //     public static void printNum(int n){
// //         if (n == 0) { // base case for handle recursion overflow
// //             return;
// //         }
// //         System.out.println(n);
// //         printNum(n-1);
// //     }
// //     public static void main(String[] args){
// //         int n=5;
// //         printNum(n);
// //     }
// // }
