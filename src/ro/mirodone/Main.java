package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        // palindrome using Stack

        PalindromeCheck ps = new PalindromeCheck();
        ps.palindromeStack("abta");

        // palindrome using Queue

        PalindromeCheck pq = new PalindromeCheck();
        pq.palindromeQueue("ala");

        
    }
}
