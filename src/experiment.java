import java.util.Scanner;
public class experiment {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String name = new String("moralkunal");


        String userName = myObj.nextLine();


        while (userName != name) {


            if (userName == name) {
                System.out.println("Loading...");
            } else {
                System.out.println("Please enter correct user-name");
            }

        }
    }
}

