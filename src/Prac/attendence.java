package Prac;
import java.util.*;
class TestClass {

    public static int getSeconds(String s)
    {
        int sec = 0;
        sec = (s.charAt(0)*10+s.charAt(1))*3600 + (s.charAt(3)*10+s.charAt(4))*60 + s.charAt(6)*10+s.charAt(7);
        return sec;
    }

    public static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }

    public class attendence {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            String s1 = s.next();
            int startTime = getSeconds(s1);
            String s2 = s.next();
            int endTime = getSeconds(s2);
            int arraySize = endTime - startTime;
            int arr[] = new int[arraySize];
            int userAttendance [] = new int[arraySize];
            int minCount = n;
            for (int i = 0; i < arraySize; i++) {
                arr[i] = 0;
                userAttendance[i] = 0;
            }
            while (n > 0) {
                int sid = s.nextInt();
                int m = s.nextInt();
                while (m > 0) {
                    int stuStartTime = getSeconds(s.next());
                    int stuEndTime = getSeconds(s.next());
                    for (int i = stuStartTime - startTime; i < stuEndTime - startTime; i++) {
                        arr[i]++;
                        if (sid == 1)
                            userAttendance[i] = 1;
                    }
                    m--;
                }
                n--;
            }
            for (int i = 0; i < arraySize; i++) {
                if (minCount > arr[i])
                    minCount = arr[i];
            }
            int num = 0, den = 0;
            for (int i = 0; i < arraySize; i++) {
                if (arr[i] != minCount)
                    continue;
                den++;
                if (userAttendance[i] == 1)
                    num++;
            }
            int gcdAmt = gcd(den, num);
            num /= gcdAmt;
            den /= gcdAmt;
            if (num != 0)
                System.out.println(num + "/" + den);
            else
                System.out.println("0");

          }
}
}
