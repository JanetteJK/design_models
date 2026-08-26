import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which kind of map do you want to play?\n1.) City\n2.)Wilderness");
        int choice = sc.nextInt();
        if (choice == 1) {
            Map map = new WildernessMap();
            map.display();
        }

    }
}