import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
       long number, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Digit number: ");
        number = sc.nextLong();
        sc.close();

        for (sum = 0; number != 0; number /= 10) {
            sum += number % 10;
        }
        System.out.println("ForLoop Sum of ALL digits: " + sum

        );
    }
}
