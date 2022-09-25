import java.util.Scanner;
public class PracticeSet04 {
    public static void main(String[] args) {
        // Practice Problem 1...............
        /*.........Scanner sc = new Scanner(System.in);
        float[] sum = {652.657f, 687.659f, 985.680f, 968.365f, 378.615f};
        float marks = 0;
        for (float element : sum) {
            marks = marks + element;
        }
        System.out.println("The Output is given by " + marks);............*/


        // Practice Problem 2.....................

        float[] num = {652.657f, 687.659f, 985.680f, 968.365f, 378.615f};
        float marks1 = 652.657f;
        boolean ans = false;
        for (float element : num) {
            if (element==marks1) {
                ans = true;
                break;
            }
            if (ans) {
                System.out.println("This Value is present in the given Array");
            }
            else {
                System.out.println("This is not present in the given Array");
            }

        }
    }
}