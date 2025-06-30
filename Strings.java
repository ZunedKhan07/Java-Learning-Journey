// import java.util.*;

// public class Strings {
//     public static void main(String[] args){
        // StringBuilder sb = new StringBuilder("Juned");
        // System.out.println(sb);

        // sb.insert(5, " Khan");
        // System.out.println(sb);

        // sb.replace(0, 1,"Z" );
        // System.out.println(sb);

        // sb.append(" S"); // str = str + "S"; (for String)
        // sb.append("W");
        // sb.append(".");
        // sb.append(" Eng.");
        // System.out.println(sb);
        // System.out.println(sb.length());

        // StringBuilder sb = new StringBuilder("Hello");

        // for(int i=0; i<sb.length()/2; i++){
        //     int front = i;
        //     int back = sb.length() - 1 - i;

        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);

        //     sb.setCharAt(front, backChar);
        //     sb.setCharAt(back, frontChar);
        // }
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);sb.reverse();
        // System.out.println(sb);



        //  Convert the first letter of every word in a string to uppercase using StringBuilder.
        // String str = "my name is juned";
        // StringBuilder sb = new StringBuilder(str);

        // // First letter ko capital karo
        // if (sb.length() > 0 && Character.isLowerCase(sb.charAt(0))) {
        //     sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        // }

        // // Har space ke baad wala character capital karo
        // for (int i = 1; i < sb.length(); i++) {
        //     if (sb.charAt(i - 1) == ' ' && Character.isLowerCase(sb.charAt(i))) {
        //         sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        //     }
        // }

        // System.out.println(sb); 
    

        //  Write a program using StringBuilder to remove duplicate characters from a string.
//         String str = "programing";
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             // check if ch already present in sb
//             if (sb.indexOf(String.valueOf(ch)) == -1) {
//                 sb.append(ch);
//             }
//         }

//         System.out.println("After removing duplicates: " + sb);

//     }
    
// }