import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextValidator[] validators = {new PhoneValidator(), new NumberValidator(), new EmailValidator(),new ColorValidator()};
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            boolean found = false;
            for (TextValidator validator : validators) {
                if (validator.validate(line)) {
                    System.out.println("it's a " + validator.name());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("i don't know");
            }
        }
    }//TODO: закончить валидаторы email, number(1.23, 123, -74, -74.123e44)
    //TODO: сделать тесты junit
}
