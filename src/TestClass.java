import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Thing[] things = new Thing[3];
        int a = 0;
        Thing b;
        while (a < things.length) {
            System.out.println("Podaj unikalne wartości. Podaj imię i wiek: ");
            b = new Thing(scan.nextLine(), scan.nextInt());
            for (int i = 0; i < things.length; i++) {
                if (b.equals(things[i])) {
                    System.out.println("Wartości nie są unikalne");
                }
            }
            b = things[a];
            a++;
            scan.nextLine();
        }


        System.out.println("Wartości są odpowiednie i unikalne!");
    }
}

