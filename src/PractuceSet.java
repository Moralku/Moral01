import java.util.Scanner;

public class PractuceSet {

    public static void main(String[] args) {


        //Arithmstic Calculations      Que. 1
      /*float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

                  // Decryption      Que. 2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

                 // Encryption
        char Grade1 = 'B';
        Grade1 = (char)(grade - 8);
        System.out.println(Grade1);*/


        // Comparision of number   Que. 3
        /*Scanner KD = new Scanner(System.in);
                float a = KD.nextFloat();
                float b = KD.nextFloat();
        System.out.println(a + b);
        System.out.println(a + b <=10);*/


        // Write the following expression    Que. 4   v*v - u*u / 2*a*s
        Scanner KD = new Scanner(System.in);
        float v1 = KD.nextFloat();
        // float v2 = KD.nextFloat();
        float u1 = KD.nextFloat();
        // float u2 = KD.nextFloat();
        float a = KD.nextFloat();
        float s = KD.nextFloat();
        System.out.print("Ans.  ");
        System.out.println(v1*v1 - u1*u1/2*a*s);

    }
}