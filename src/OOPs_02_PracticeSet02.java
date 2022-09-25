import java.util.Scanner;
class square{
    float side;
    float area;
    float parameter;

    public float area(){

        return side*side;

    }
    public float parameter(){
        return 4*side;
    }
}



public class OOPs_02_PracticeSet02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square kunal = new square();
        System.out.print("Enter side ");
        kunal.side = sc.nextFloat();
        System.out.println(kunal.area());
        System.out.println(kunal.parameter());




    }
}
