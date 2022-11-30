package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your word ");
        String n = input.next();
        String x = "";

        for (int i = n.length() - 1; i >= 0; i--) {

            x += n.charAt(i);
        }
        System.out.println("the reverse is " + x);
        if (n.equals(x)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not Palindrome");
        }
    }

}
