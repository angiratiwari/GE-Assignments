import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times to flip the coin: ");

        int flips = sc.nextInt();

        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0, tails = 0;

        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headPercent = (heads * 100.0) / flips;
        double tailPercent = (tails * 100.0) / flips;

        System.out.println("Percentage of Heads: " + headPercent + "%");
        System.out.println("Percentage of Tails: " + tailPercent + "%");
    }
}
