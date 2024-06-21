import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class RandomNameGenerator {
    private static final String ALLOWED_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final Random random = new Random();

    /**
     * Generates a random name of the specified length, consisting only of letters.
     *
     * @param length The length of the name to generate.
     * @return A random name as a String.
     */
    public static String generateRandomName(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be at least 1.");
        }

        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARS.length());
            nameBuilder.append(ALLOWED_CHARS.charAt(randomIndex));
        }

        return nameBuilder.toString();
    }
    public static String generateRandomName() {
        return generateRandomName(20);
    }

//    public static void main(String[] args){
//        try {
//            Logger logger = Logger.getLogger(RandomNameGenerator.class.getName());
//            FileHandler fileHandler = new FileHandler("log.txt");
//
//            logger.addHandler(fileHandler);
//
//            String randomName = generateRandomName(15);
//            logger.info("Generated random name: " + randomName);
//
//            fileHandler.close();
//            } catch (Exception ignore){
//            }
//    }
}