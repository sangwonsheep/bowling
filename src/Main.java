import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    static String NAME = "";

    public static void print() {
        Scanner input = new Scanner(System.in);
        inputName(input);
        printTemplate();
        inputScore(input);
    }

    public static void printTemplate() {
        System.out.printf("| %4s |", "NAME");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("  %02d  |", i);
        }
        System.out.println();
        System.out.printf("| %4s |", NAME);
        for(int i = 1; i <= 10; i++) {
            System.out.print("      |");
        }
        System.out.println();
        System.out.printf("| %4s |", "");
        for(int i = 1; i <= 10; i++) {
            System.out.print("      |");
        }
        System.out.println();
    }

    public static void inputScore(Scanner input) {
        System.out.print(NAME + "'s turn : ");
        int n = input.nextInt();
        list.add(n);
    }

    public static void inputName(Scanner input) {
        System.out.print("플레이어 이름은(3 english letters)?: ");
        NAME = input.nextLine();
    }

    public static void main(String[] args) {
        print();
    }
}