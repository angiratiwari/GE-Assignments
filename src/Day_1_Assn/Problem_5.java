package Day_1_Assn;
import java.util.Scanner;
public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int n = sc.nextInt();

        System.out.print("Prime Factors: ");

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }
    }
}
