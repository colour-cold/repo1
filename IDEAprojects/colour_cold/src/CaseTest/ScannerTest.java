package CaseTest;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        max(i1, i2, i3);
    }

    public static void max(int i1, int i2, int i3) {
        int max = i1;
        if (i2 > i1) {
            max = i2;
            if (i3 > i2) {
                max = i3;
            }
        } else if (i3 > i1) {
            max = i3;
        }
        System.out.println(max);
    }
}
