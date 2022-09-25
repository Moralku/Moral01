import java.awt.print.PrinterGraphics;
import java.util.Scanner;

class employee1 {
    int salary;
  String name;

    public int getSalary(){
        return salary;
    }
            public String getName(){
        return name;
            }
            public void setname(String n){
                  name = n;
            }

}
class cellphone{
    public void ring(){
        System.out.println("your cellphone is ringing");
    }
    public void vibrate(){
        System.out.println("your cellphone is vibrating");
    }

}

public class OOPs_02_PracticeSet {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

// Problem 01....................

        employee1 moral = new employee1();
        moral.name = "My name is Moral";
        moral.salary = 254;
        System.out.println(moral.name);
        System.out.println(moral.salary);

    //  Problem 02...........
        cellphone moral01 = new cellphone();
        moral01.ring();
        moral01.vibrate();
        System.out.println();


    }

}
