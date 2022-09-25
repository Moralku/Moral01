public class break_continue {
    public static void main(String[] args) {

        // using break and continous function FOR loop.............

       /* for (int i = 1; i<=10; i++){
            System.out.println(i);
            System.out.println("Moral is great");
            if (i==4){
            System.out.println("end the moral");
            break;
        }
    }*/

        // using break and continous function with WHILE.......

        int a = 0;
        while (a<50){
            System.out.println(a);
            System.out.println("java is great");
            a++;
            if (a==5) {
                System.out.println("my name is Kunal");
               continue;                   // it run just upto 2 only.........
            }
            System.out.println(a);
            System.out.println("ending the loops");
        }
}
}
