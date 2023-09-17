
import java.util.*;
class countChar {
    public static void main(String[] args) {
        String  str = "abccdefgaa";
        char ch = 'a';
        int c=0;
        for(int i = 0 ; i<str.length(); i++){
            if(ch==str.charAt(i)){
                c++;
            }
        }
        System.out.println("Occurence of the character is :"+c);
    }
}
