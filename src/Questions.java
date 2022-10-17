
abstract class Pen {
    abstract void write();
    abstract void refill();

    static class fountainpen extends Pen {


        @Override
        void write() {
            System.out.println("write with your pen");
        }

        @Override
        void refill() {
            System.out.println("change your refill");
        }
        void changenibb(){
            System.out.println("change your penibb");
        }
    }
}
public class Questions {
    public static void main(String[] args) {
        Pen.fountainpen pen = new Pen.fountainpen();
        pen.changenibb();
        pen.refill();
    }
}
