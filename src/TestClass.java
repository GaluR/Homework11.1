import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Thing[] things = new Thing[3];
        do {
            System.out.println("Podaj unikalne wartości. Podaj imię i wiek: ");
            for (int i = 0; i < things.length; i++) {
                things[i] = new Thing(scan.nextLine(), scan.nextInt());
                scan.nextLine();
            }
        } while (things[0].equals(things[1]) || things[1].equals(things[2]) || things[0].equals(things[2]));
        System.out.println("Wartości są odpowiednie i unikalne!");
    }
}