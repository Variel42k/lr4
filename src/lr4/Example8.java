package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите текст для шифрования (ru): ");
        String plaintext = inCMD.nextLine();
        System.out.print("Введите ключ: ");
        int shift = inCMD.nextInt();
        String ciphertext = "";
        char alphabet;
        for (int i = 0; i < plaintext.length(); i++) {
            alphabet = plaintext.charAt(i);

            if (alphabet >= 'а' && alphabet <= 'я') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'я') {
                    alphabet = (char) (alphabet + 'а' - 'я' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else if (alphabet >= 'А' && alphabet <= 'Я') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Я') {
                    alphabet = (char) (alphabet + 'А' - 'Я' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println("Текст после преобразования : " + ciphertext);
        System.out.print("Выполнить обратное преобразование? (y/n) ");
        Scanner backCMD = new Scanner(System.in);
        String answer = backCMD.nextLine();

        String output = (answer.equalsIgnoreCase("y")) ? plaintext
                : (answer.equalsIgnoreCase("n")) ? "До свидания!" : "Введите корректный ответ";
        System.out.println(output);
        inCMD.close();
        backCMD.close();
    }
}
