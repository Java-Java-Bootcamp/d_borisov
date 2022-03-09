import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator implements TextValidator{
    private final static Pattern pattern = Pattern.compile("\\d+");

    @Override
    public boolean validate(String validate) {
        Matcher matcher = pattern.matcher(validate);
        return matcher.matches();
    }

    @Override
    public String name() {
        return "number";
    }
}
