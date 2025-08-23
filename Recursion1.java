// find GCD  (grater common diviser)
// Constaints : 0 <= x, y <= 1e6
// Input : x = 4, y = 9
// Output1 : 1

public class Recursion1 {
// // bruit forse approach

//     public static int GCD(int x, int y){

//         if (x < y) {
//             for(int i=x; i>=1; i--){
//                 if(x % i == 0 && y % i == 0){
//                     System.out.println(i);
//                     return i;
//                 }
//             }
//         }
//         return 1;
//     }
//     public static void main(String[] args) {
//         int x = 5;
//         int y = 9;
//         GCD(x, y);
//     }
}




// import java.util.Scanner;

// public class Recursion1 {


//                   // 1-2+3-4+5-6+7-8+..... T.C. = O(n)

// public static int soln(int n){
//     if(n == 0) return 0;

//     if (n % 2 == 0) return soln(n-1) - n;

//     return soln(n-1) + n;
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     System.out.println(soln(n));
// }






// public static int mul(int n, int k){

//     if(k == 0) return 0;
    
//     int ans = n + mul(n, k-1);
//     System.out.println(ans);
//     return ans;
// }

// public static void main(String[] args) {
//     mul(3, 5);
// }


//  other Opr.


// public static int mul(int n, int k){

//     if(k == 0) return 0;
//     mul(n, k-1);
//     int mult = n*k;
//     System.out.println(mult);

//     return mult;
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int k = sc.nextInt();
//     mul(n, k);
// }



// time and space comp.: O(Q)

// public static int powerVal(int p, int q) {

//     if (q == 0) return 1;

//     return powerVal(p, q-1)*p;
// }

// public static void main(String[] args) {
//     System.out.println(powerVal(0, 0));
// }

// // p ki power q with better T.C. and S.C.
// // T.C. = log(q)
// static int powerVal(int p, int q){
//     if(q == 0) return 1;

//     int smallPower = powerVal(p, q/2);

//     if (q % 2 == 0) return smallPower * smallPower;

//     return smallPower * smallPower * p;
// }

// public static void main(String[] args) {
//     System.out.println(powerVal(2, 3));
// }


//              // count of dijits

// public static int countNum(int n){
//     if (n == 0) return 0;

//     return 1 + countNum(n/10);
// }

// public static void main(String[] args) {
//     System.out.println(countNum(673));
    
// }




    
//                      // sum of dijits

// public static int printDjtSum(int n){

//     if (n >= 0 && n <= 9) return n;

//     return n%10 + printDjtSum(n/10);
// }

// public static void main(String[] args) {
//     System.out.println(printDjtSum(1));
// }




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
// }
