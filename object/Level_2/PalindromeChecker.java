import java.util.Scanner;

class PalindromeChecker {

    String text;

    void checkPalindrome() {

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equals(reverse))
            System.out.println("The string is Palindrome");
        else
            System.out.println("The string is NOT Palindrome");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker();

        System.out.print("Enter a string: ");
        p.text = sc.nextLine();

        p.checkPalindrome();
    }
}