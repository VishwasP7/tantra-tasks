import java.util.*;
class palindrome {
    public static void main(String[] args) {
        String  str = "madam",revStr = "";
        for(int i = str.length()-1;i>=0;i--){
            revStr= revStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revStr.toLowerCase()))
        {
            System.out.println("\nyes string is palindrome");
        }
        else
        {
            System.out.println("\nNo string is not palindrome");
        }
    }
}
