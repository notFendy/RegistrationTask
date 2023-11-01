package hometask;


import java.util.regex.Pattern;

public class UserService {

    public void checker(User user) {


            //regex name
            if (Pattern.matches("[A-Z][a-z]{7,15} [A-Z][a-z]{5,15}", user.getFullname())) {
                user.setFullname(user.getFullname());

            } else {
                System.out.println("Error Please re-enter!");

            }

            //regex email
            if (Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", user.getEmail())) {
                user.setEmail(user.getEmail());
            } else {
                System.out.println("Error Please re-enter!");

            }

            //phone regex
            if (Pattern.matches("\\+998(77|99|95|94|93|90|33)[0-9]{7}", user.getPhoneNumber())) {
                user.setPhoneNumber(user.getPhoneNumber());
            } else {
                System.out.println("Error Please re-enter!");

            }

            //regex password
            if (Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", user.getPassword())) {
                user.setPassword(user.getPassword());
            } else {
                System.out.println("Error Please re-enter!");

            }



    }
}





