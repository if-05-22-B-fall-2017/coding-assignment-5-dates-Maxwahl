import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        return Pattern.compile("^(3[01]|[0-2]?[\\d])[ \\.\\-](1[0-2]||0?\\d)[ \\.\\-](19|20)?\\d{2}$").matcher(dateString);
        //(1[0-2]||0?\\d)
    }
}
