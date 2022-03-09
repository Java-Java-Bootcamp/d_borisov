import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator implements TextValidator{
    private final static Pattern pattern = Pattern.compile("\\+\\d\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}+|\\+?[7-8]\\d{10}");

    @Override
    public boolean validate(String validate) {
        Matcher matcher = pattern.matcher(validate);
        return matcher.matches();
    }

    @Override
    public String name() {
        return "phone";
    }
}
