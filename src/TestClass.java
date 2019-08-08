import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Thing[] things = new Thing[3];
        int a=0;
        while (a<things.length){

            System.out.println("Podaj unikalne wartości. Podaj imię i wiek: ");
                things[a] = new Thing(scan.nextLine(), scan.nextInt());
                if(a!=0) {
                    if (things[a].equals(things[a - 1])) {
                        scan.nextLine();
                        System.out.println("Wartość nie jest unikalna, wprowadź jeszcze raz.");
                    } else {
                        scan.nextLine();
                        a++;
                    }
                }else {
                    scan.nextLine();
                    a++;
                }


        }
        System.out.println("Wartości są odpowiednie i unikalne!");
    }
}