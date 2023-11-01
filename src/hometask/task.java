package hometask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



//        //name regex
//        System.out.println(Pattern.matches("[A-Z][a-z]{7,15} [A-Z][a-z]{5,15}","Serikboyev Quvonchbek"));
//
//        //email regex
//        System.out.println(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$","whatisthis@gmail.com"));
//
//        //phoneRegex
//        System.out.println(Pattern.matches("\\+998(77|99|95|94|93|90|33)[0-9]{7}","+998998650066"));
//
//        //password regex
//        System.out.println(Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$","aaZZa44@"));
//


        System.out.print("Enter full name: ");
        String full_name = scanner.nextLine();
        System.out.println();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.println();

        System.out.print("Enter phone number: ");
        String phone_number = scanner.nextLine();
        System.out.println();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println();

        User user = new User(full_name,email,phone_number,password);
        UserService us = new UserService();
        us.checker(user);














    }
}
