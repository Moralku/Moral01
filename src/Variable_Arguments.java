public class Variable_Arguments {

    static int sum(int... arr) {
        // Avaiable as int [] arr;
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }


        public static void main (String[]args){
            System.out.println("The sum of 4 and 5 is:" + sum(4,5));
            System.out.println("The sum of 4, 3 and 5 is:" + sum(4,3,5));
            System.out.println("The sum of 2, 4, 3 and 5 is:" + sum(2,4,3,5));


        }
    }
