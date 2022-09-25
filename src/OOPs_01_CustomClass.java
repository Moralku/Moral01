
class employee{
    int id;
    String name;
    public void newcustom(){
        System.out.println("My ID is" +   id);
        System.out.println("My name is" +   name);

    }

}
public class OOPs_01_CustomClass {
    public static void main(String[] args) {

        employee moral = new employee();
        employee moral01 = new employee();

        moral.id = 50;
        moral.name = "Kunal";
        moral01.id = 450;
        moral01.name = "Deepanshu";
       // System.out.println(moral.id);
       // System.out.println(moral.name);
        moral.newcustom();
        moral01.newcustom();
    }
}
