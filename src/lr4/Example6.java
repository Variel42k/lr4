package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int heith = rnd.nextInt(20 - 10) + 5;
        System.out.println("Рандомная высота: " + heith);
        int weiht = rnd.nextInt(20 - 10) + 5;
        System.out.println("Ширина высота: " + weiht);

        int[][] a = new int[heith][weiht];
        for (int i = 0; i < heith; i++) {
            for (int j = 0; j < weiht; j++) {
                a[i][j] = rnd.nextInt(10);
            }
        }

        System.out.println("Начальный массив");
        for (int i = 0; i < heith; i++) {
            for (int j = 0; j < weiht; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }

        int remY = rnd.nextInt(heith);
        int remX = rnd.nextInt(weiht);
        boolean stopJump = true;
        int[][] rema = new int[heith - 1][weiht - 1];
        for (int i = 0; i < heith - 1; i++) {
            if (i == remY && stopJump) {
                stopJump = false;
                i--;
                continue;
            }
            for (int j = 0; j < weiht - 1; j++) {
                if (j >= remX) {
                    rema[i][j] = a[i][j + 1];
                    continue;
                }
                rema[i][j] = a[i][j];
            }

        }

        System.out.printf("\nМассив с удаленными %d столбцом и %d строкой \n", remX, remY);
        for (int i = 0; i < heith - 1; i++) {
            for (int j = 0; j < weiht - 1; j++) {
                System.out.printf("%3d", rema[i][j]);
            }
            System.out.println();
        }
    }
}
