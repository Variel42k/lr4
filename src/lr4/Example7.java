package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int fst = inCMD.nextInt();
        System.out.print("Введите ширину: ");
        int snd = inCMD.nextInt();

        int numeric = 1;

        int[][] array = new int[fst][snd];

        for (int y = 0; y < snd; y++) {
            array[0][y] = numeric;
            numeric++;
        }
        for (int x = 1; x < fst; x++) {
            array[x][snd - 1] = numeric;
            numeric++;
        }
        for (int y = snd - 2; y >= 0; y--) {
            array[fst - 1][y] = numeric;
            numeric++;
        }
        for (int x = fst - 2; x > 0; x--) {
            array[x][0] = numeric;
            numeric++;
        }

        int x1 = 1;
        int y1 = 1;

        while (numeric < fst * snd) {
            while (array[x1][y1 + 1] == 0) {
                array[x1][y1] = numeric;
                numeric++;
                y1++;
            }

            while (array[x1 + 1][y1] == 0) {
                array[x1][y1] = numeric;
                numeric++;
                x1++;
            }

            while (array[x1][y1 - 1] == 0) {
                array[x1][y1] = numeric;
                numeric++;
                y1--;
            }

            while (array[x1 - 1][y1] == 0) {
                array[x1][y1] = numeric;
                numeric++;
                x1--;
            }
        }

        for (int x = 0; x < fst; x++) {
            for (int y = 0; y < snd; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = numeric;
                }
            }
        }

        for (int x = 0; x < fst; x++) {
            for (int y = 0; y < snd; y++) {
                if (array[x][y] < 10) {
                    System.out.printf("   " + array[x][y]);
                } else {
                    System.out.printf("  " + array[x][y]);
                }
            }
            System.out.println("");
        }
        inCMD.close();
    }
}
