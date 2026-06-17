package Assignments;
import java.util.Scanner;

class ReviewAnalyzer {

    String review;

    // Constructor
    ReviewAnalyzer(String review) {
        this.review = review;
    }

    // Word Count
    int getWordCount() {
        String[] words = review.trim().split("\\s+");
        return words.length;
    }

    // Character Count (excluding spaces)
    int getCharCount() {
        return review.replace(" ", "").length();
    }

    // Normalize Text
    String toUpperCase() {
        return review.toUpperCase();
    }

    String toLowerCase() {
        return review.toLowerCase();
    }

    // Reverse Text
    String reverseText() {
        return new StringBuilder(review).reverse().toString();
    }

    // Palindrome Check (ignoring spaces & case)
    boolean isPalindrome() {
        String cleaned = review.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Display Analysis
    void displayAnalysis() {
        System.out.println("\n--- Review Analysis ---");
        System.out.println("Original Review: " + review);
        System.out.println("Word Count: " + getWordCount());
        System.out.println("Character Count: " + getCharCount());
        System.out.println("Uppercase: " + toUpperCase());
        System.out.println("Lowercase: " + toLowerCase());
        System.out.println("Reversed: " + reverseText());
        System.out.println("Palindrome: " + (isPalindrome() ? "Yes" : "No"));
    }
}

// Main Class
public class Assignment8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer review: ");
        String input = sc.nextLine();

        ReviewAnalyzer analyzer = new ReviewAnalyzer(input);
        analyzer.displayAnalysis();

        sc.close();
    }
}

