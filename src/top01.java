import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;
public class top01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float age = sc.nextFloat();
        if(age>18) {
            System.out.println("yes you can drive now");
        }
            else{
                System.out.println("no you can not drive yet");

        }

    }
}
