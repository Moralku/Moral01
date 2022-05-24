import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("taking input");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENGLISH");
        int E = sc.nextInt();
        System.out.println("MATHS");
        int M = sc.nextInt();
        System.out.println("CHEMISTRY");
        int C = sc.nextInt();
        System.out.println("PHYSICS");
        int P = sc.nextInt();
        System.out.println("PHYSICAL EDUCATION");
        int PE = sc.nextInt();
        int sum = E + M + C + P + PE;
        System.out.print("Total = ");
        System.out.println(sum);
        int TS = 5;                   // TS = TOTAL SUBJECT'S
        int PCT = sum/TS;
        System.out.println("PERCENTAGE");
        System.out.println(PCT);

    }
}