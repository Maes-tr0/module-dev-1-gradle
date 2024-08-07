package ua.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Write your last name: ");
        String lastName = scanner.nextLine();

        MyFullName myFullName = new MyFullName(firstName, lastName);
        System.out.print("\nYour full name is:\n" + myFullName.getFullNameByGSON());
    }
}
