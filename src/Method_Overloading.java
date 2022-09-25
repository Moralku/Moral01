public class Method_Overloading {
    static void foo(){
        System.out.println("Good Night...!");
    }
    static void foo(int a){
        System.out.println("Good Night" +  a);
    }
    static void foo(int x, int y){
        System.out.println("Good Night" + x + "Good Morning" + y);
    }
    static void change01(int a){
      a = 98;
    }
    static void change02(int [] arr){
        arr [0] = 98;

    }
    static void motiavation(){
        System.out.println("Nothing is impossible. ...");
        int a = 80;
    }

    public static void main(String[] args) {
     //motiavation();
        /*.....................int [] marks = {35,65,65,95,96,64};

        change02(marks);
        System.out.println("The number comes out to be :" +  marks[0]);........................*/
foo();
foo(3000);
foo(3000,700);
    }
}
