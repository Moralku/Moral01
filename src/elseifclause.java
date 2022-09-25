import java.util.Scanner;

public class elseifclause {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Float age = sc.nextFloat();
        if(age>60){
            System.out.println("You are Experienced");
        }
        else if (age>45){
            System.out.println("You are Semi-Experienced");
        }
        else if (age>30) {
            System.out.println("You are a Learner");
        }
        else if (age>25) {
                System.out.println("You are not Qualified");
            }
            }
        }


