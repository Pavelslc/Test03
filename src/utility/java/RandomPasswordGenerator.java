import java.util.Random;

public class RandomPasswordGenerator {
    private static final String ALLOWED_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%^&*()_+-={}:<>?[]|\\;\"'~`";

    public static String generateRandomPassword(int length) {
        if (length < 8 || length > 72) {
            throw new IllegalArgumentException("Length must be between 8 and 72.");
        }

        Random random = new Random();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARS.length());
            passwordBuilder.append(ALLOWED_CHARS.charAt(randomIndex));
        }

        return passwordBuilder.toString();
    }

    public static String generateRandomPassword(){
        return generateRandomPassword(20);
    }

}