public class Multidimarraysfnc {
    public static void main(String[] args) {
        int[] marks; // 1-D Arrays..............
        int[][] flats;  // 2-D Arrays.............

        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("I am differentating the Flats by 2-D arrays using Loops");
        for (int a = 0; a < flats.length; a++) {
            for (int b = 0; b < flats[a].length; b++) {
                System.out.print(flats[a][b]);
                System.out.print(" ");
            }
            System.out.println("");


        }
    }
}