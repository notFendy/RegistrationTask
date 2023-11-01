package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {
    public static void main(String[] args) {


//        System.out.println(Pattern.matches("[A-Z]{2}[0-9]{7}","AA1234567"));
//        System.out.println(Pattern.matches("[A-Z]{2}[0-9]{7}","AAA234567"));
//        System.out.println(Pattern.matches("[A-Z]{2}[0-]9{7}","AA12234567"));


//        System.out.println(Pattern.matches("(10|01)[A-Z][0-9]{3}[A-Z]{2}","10B112AA"));
//        System.out.println(Pattern.matches("(10|01)[0-9]{3}[A-Z]{3}","10112AAA"));


//        String regex_ip = "(\\d{1,2}[0-5]?)";
//        String regex = regex_ip + "\\." + regex_ip + "\\." + regex_ip + "\\." + regex_ip;


        System.out.println(Pattern.matches(
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$","192.168.43.255"));







    }
}
