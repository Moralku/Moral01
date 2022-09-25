public class Arrays02 {
    public static void main(String[] args) {
        int [] marks = {54,95,57,62,14};
        // System.out.println(marks.length);

        // Displaying the arrays......................
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying arrays for Loops............
       for (int a = 0; a<marks.length; a++){
            System.out.println(marks[a]);
        }

        // using FOR & EACH loops................
        for(int element : marks){
        System.out.println(element);
    }
}
}
