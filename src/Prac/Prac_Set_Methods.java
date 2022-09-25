package Prac;

public class Prac_Set_Methods {
    // Que. 1 Print Table..............

   /*............ static void multliplication(int n){
        for(int a = 1; a<=10; a++){
            System.out.format("%d X %d = %d\n", n, a, n*a);

        }
    }...................*/

// Que. 2 Draw the Patteren.................

    /*.............static void fnc(int n) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }........................*/

    // Que. 3 Recurssion Function...................

/*....................static int rec(int n){
    if (n==1){
        return 1;
    }
    else {
        return n + rec(n-1);
    }
}.............................*/

    // Que. 4 Febonnaic Series...........

static int feb(int n){
    if (n==1){
        return 0;
    }
    else if (n==2){
        return 1;

    }
   else {
       return feb(n-1) + feb(n-2);
    }

    }

    public static void main(String[] args) {
       // multliplication(11);    ................for Que. 1\

        //  fnc(5);      ............for Que. 2

       /*........... int c = rec(5);.......
        System.out.println(c);...............for Que. 3......*/

        int sum = feb(50);
        System.out.println(sum);
    }
}
