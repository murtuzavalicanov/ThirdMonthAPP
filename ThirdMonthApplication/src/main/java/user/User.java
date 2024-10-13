package user;

import java.util.Scanner;

public class User {

    public static void nameAndSurname() {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Surname?");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc.nextLine();
    }
}
