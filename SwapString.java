import java.util.*;
class swapString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("\nString 1:" +s1);
        System.out.println("\nString 2:" +s2);
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("\nString 1:" +s1);
        System.out.println("\nString 2:" +s2);
        
    }
}
