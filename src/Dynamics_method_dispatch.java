import org.ietf.jgss.GSSManager;

class phone {

    public void name() {
        System.out.println("my name is kunal");
    }

    public void naam() {
        System.out.println("mera naam kunal hai");
    }

    class smartphone extends phone{
        public void swagat() {
            System.out.println("swagat nahi kaaro ge humara");
        }

        public void name() {
            System.out.println("my name is kunal in class 2");

        }
    }
}


public class Dynamics_method_dispatch {
    public static void main(String[] args) {
       // phone obj = new phone();
        // obj.name();

    }
}
