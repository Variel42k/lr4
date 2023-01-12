package lr4;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner inCMD = new Scanner(System.in);
        System.out.print("Введите текст для шифрования (en): ");
        String plaintext = inCMD.nextLine();
        System.out.print("Введите ключ: ");
        int shift = inCMD.nextInt();
        String ciphertext = "";
        char alphabet;
        for (int i = 0; i < plaintext.length(); i++) {
            alphabet = plaintext.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
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
