
abstract class case02{
    public case02(){
        System.out.println("me hi kunal");

    }
    public void sayHI(){
        System.out.println("namestay");
    }
    abstract public void greet();
    //abstract public void greet02(){
}
class case03 extends case02{
   @Override
    public void greet(){
        System.out.println("NAMESTAY");
    }
    public void greet02(){
        System.out.println("hola");
    }
}
/*class case04 extends case02{
    @Override
    public void sayHI() {

    }
}*/

public class abstractCLASS_abstractMETHOD {
    public static void main(String[] args) {

    }
}
