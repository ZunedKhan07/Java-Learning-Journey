public class Backtraking2 {
    public static void printPerm(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
             currChar + printPerm(str, perm + currChar, idx+1);
        }
    }
}
