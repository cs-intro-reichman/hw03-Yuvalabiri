/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String res = "";
        for (int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if (chr >= 65 && chr <= 90){
                chr = (char)(chr + 32);
                res = res + chr;
            } else {
                res = res + chr; // #feedback - you can avoid having this else and extract "res = res + chr;" outside of the "if" because we always need to update res.
            }
        }
        return res;
    }
}
