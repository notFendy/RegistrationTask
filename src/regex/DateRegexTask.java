package regex;

import java.util.regex.Pattern;

public class DateRegexTask {
    public static void main(String[] args) {


        System.out.println(Pattern.matches("([0-9]|[1-2]{2})|(30|31) ","31"));



    }
}
