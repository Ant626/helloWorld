import java.util.Scanner;


public class Loops{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter Number For n: "  );
        n = scan.nextInt();

        int sum = 0;
        int counter = 0;

        while (n > counter) {
            counter++;

            if (n % counter == 0) {
                sum += counter;
            }
        }
        System.out.print(sum);
    }
}
