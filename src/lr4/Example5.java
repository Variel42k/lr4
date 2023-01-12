package lr4;
import java.util.Random;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int heith = inCMD.nextInt();
        System.out.print("Введите ширину: ");
        int weiht = inCMD.nextInt();

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

        int[][] at = new int[weiht][heith];
        for (int i = 0; i < weiht; i++) {
            for (int j = 0; j < heith; j++) {
                at[i][j] = a[j][i];
            }
        }

        System.out.println("Траспанированный массив");
        for (int i = 0; i < weiht; i++) {
            for (int j = 0; j < heith; j++) {
                System.out.printf("%3d", at[i][j]);
            }
            System.out.println();
        }

        inCMD.close();
    }
}
