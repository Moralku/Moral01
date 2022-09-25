import java.util.Scanner;

public class PracticeSet03 {
    public static void main(String[] args) {

        // Question 1.......
        /*...int n = 4;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("10");
            }
            System.out.println("\n");
        }.....*/

        // Question 2...........even number

       /* int a = 20;
       for (int b = 0; b<=a; b++){

            System.out.println(2*b);
        }..........*/

       // Question 2............multiplication

       /* int a = 5;
        for (int b = 1; b<=10; b++) {
            System.out.printf("%d X %d = %d\n", a, b, a * b);
        }...............*/

        // Question 3..................Find the factorial.......
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Number to find Factorial");
        int n = sc.nextInt();
        int i = 1;
        int FA = 1;
        while (i<=n) {
            FA *= i;
            i++;
        }

            System.out.println(FA);



}
}
