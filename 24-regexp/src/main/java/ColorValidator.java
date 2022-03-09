import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorValidator implements TextValidator{
    private final static Pattern pattern = Pattern.compile("#[A-Fa-f0-9]{6}|#[A-Fa-f0-9]{3}");

    @Override
    public boolean validate(String validate) {
        Matcher matcher = pattern.matcher(validate);
        return matcher.matches();
    }

    @Override
    public String name() {
        return "Color";
    }
}
