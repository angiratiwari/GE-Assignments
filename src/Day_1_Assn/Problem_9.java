package Day_1_Assn;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch < 'a' || ch > 'z') {
            System.out.println("Invalid input. Please enter an alphabet.");
            return;
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }
    }
}
