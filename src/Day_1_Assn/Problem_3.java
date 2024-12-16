
package Day_1_Assn;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, mul = 1;

        System.out.print("Enter the Value: ");

        num = sc.nextInt();

        if (num > 31) {
            System.out.println("Value of number should be less than 31");
            return;
        }
        else {
            System.out.println(mul);
            for (int j = 1; j <= num; j++) {
                mul = mul * 2;
                System.out.println(mul);
            }
        }
    }
}