package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите 1й катет: ");
        int fst = inCMD.nextInt();
        System.out.print("Введите 2й катет: ");
        int snd = inCMD.nextInt();

        char[][] arr = new char[fst][snd];

        for (int i = 0; i <= fst; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = 'A';
            }
            if (i == fst - 1)
                break;
        }
        System.out.println("");
        for (int i = 0; i < fst; i++) {
            for (int j = 0; j < snd; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");

        }

    }
}
