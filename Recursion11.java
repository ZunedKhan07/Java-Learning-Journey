// /*       Ques. : Ther are n stones. numrered 1, 2, 3, .... , N-1, For each i (0<=i<N), the hieght of stone i is hi. There is a
//          frog who is initailly on stone 0. he will repeat the following action some no. of time to reach
//          Stone N-1. 
//          if the frog is currently on stone i, jump to stone i+1 or i+2.
//          Here, a cost of |hi - hj| is incurred, where j is the stone to land on.

//          Find min possible total cost incurred before the frog reaches Stone N.

//          Input n=4
//          arr[] = 10 30 40 20
//          Output = 30
// */ 
// // TC : o(2^n)

// public class Recursion11 {

//     public static int minCost(int[] cost, int n, int idx){

//         if (idx == n-1) {
//             return 0;
//         }

//         int opt1 = Math.abs(cost[idx] - cost[idx+1]) + minCost(cost, n, idx+1);
//         if (idx == n-2) {
//             return opt1;
//         }
//         int opt2 = Math.abs(cost[idx] - cost[idx+2]) + minCost(cost, n, idx+2);

//         return Math.min(opt1, opt2);
//     }

//     public static void main(String[] args) {
//         int[] cost = {10, 30, 40, 20};
//         int res = minCost(cost, cost.length, 0);
//         System.out.println(res);
//     }
// }

/*
🟢 Question: Frog Jump – 2 (Harder Version)

Ek frog hai jo stone 0 par khada hai.

Total n stones hain, numbered from 0 to n-1.

Stone i ki height hai h[i].

Frog ek move me i+1, i+2, ..., i+k tak jump kar sakta hai (yaha k diya hoga).

Jump ka cost = |h[i] - h[j]| (jaha frog land karega).

👉 Tumhe minimum cost find karna hai frog ko stone n-1 tak pahuchne ke liye.
 */

public class Recursion11 {

    public static int minCost(int[] h, int idx, int n, int k) {
        if (idx == n - 1)
            return 0; // base case

        int ans = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (idx + j < n) {
                int cost = Math.abs(h[idx] - h[idx + j]) + minCost(h, idx + j, n, k);
                ans = Math.min(ans, cost);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int cost[] = {10, 30, 40, 50, 20};
        System.out.println(minCost(cost, 0, cost.length, 3));
    }

}