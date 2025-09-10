/*
 * ASSCI : American Standard Code for Information Interchange
 * a-z : 97 to 122
 * A-Z : 65 to 90
 * '0'-'9' : 48 to 57

 * char ch = '3'
 * int ch_val = ch - '0'; 
 */

 /*
  * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
  * Return the answer in any order.
  * Input: digits = "23"
  * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
  */

public class Recursion12 {
    
    public static void combination(String dig, String[] kp, String res){
        if (dig.length() == 0) {
            System.out.println(res + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0';  // 2
        String currChoices = kp[currNum]; // abc
        for(int i=0; i<currChoices.length(); i++){
            combination(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String dig = "253";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //              0   1    2      3      4      5      6      7       8      9

        combination(dig, kp, "");
    }
}
