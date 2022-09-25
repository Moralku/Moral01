package Prac;

class workers {
    private int id;
    private String name;


    public String getname(String n) {
             return name;
    }
    public void setId(int i){
        id  = i;

    }
    public int getId(){
        return id;
    }

}
public class Guters_Setters_AccessModifier {
    public static void main(String[] args) {
        workers moral = new workers();
        moral.getname("Moral");
        System.out.println(moral.getname());
    }
}
