import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        int length = sentence.length();
        System.out.println("Length of the sentence: " + length);

        System.out.println("Enter index:");
        int index = sc.nextInt();

        char ch = sentence.charAt(index);
        System.out.println("Character at index " + index + ": " + ch);

        System.out.println("Characters:");

        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }

        sc.close();
    }
}