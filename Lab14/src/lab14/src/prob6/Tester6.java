package lab14.src.prob6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester6 {
    public static void main(String[] args) {
        String str = "user@example.com"; //myhost@@@com.ru, НЕ РАБОТАЕТ
        String regex = "(\\w+)@(\\w+\\.)(\\w+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        if (m.matches()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}