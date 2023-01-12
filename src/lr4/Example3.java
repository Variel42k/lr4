package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int heith = inCMD.nextInt();
        System.out.print("Введите ширину: ");
        int weiht = inCMD.nextInt();

        int[][] arr = new int[heith][weiht];

        for (int i = 0; i < heith; i++) {
            for (int j = 0; j < weiht; j++) {
                arr[i][j] += 2;
            }

        }

        for (int i = 0; i < heith; i++) {
            for (int j = 0; j < weiht; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
