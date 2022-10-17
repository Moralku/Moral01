import com.sun.source.tree.BreakTree;

import java.util.Scanner;
import java.util.*;
class circle {
    public int radius;

    circle() {
        System.out.println("i am time pass");
    }

    circle(int r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
    class cylinder1 extends circle{
        public int height;
          cylinder1(int r , int h){
              super(r);
              this.height = h;
          }

          public double volume(){
            return Math.PI*this.radius*this.radius*this.height;

        }
    }


public class ch10_practiceSET {
    public static void main(String[] args) {
       cylinder1 hi = new cylinder1(5,10);

    }
}
