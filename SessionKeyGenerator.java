import java.security.SecureRandom;
import java.util.Base64;

public class SessionKeyGenerator {
    public static void main(String[] args) {
        try {
            // Create a SecureRandom instance
            SecureRandom secureRandom = new SecureRandom();
            
            // Create a byte array to hold the session key
            byte[] sessionKey = new byte[32]; // 32 bytes = 256 bits
            
            // Generate the random key
            secureRandom.nextBytes(sessionKey);
            
            // Optionally encode the key in Base64 for easier handling
            String encodedKey = Base64.getEncoder().encodeToString(sessionKey);
            
            // Output the session key
            System.out.println("Generated 256-bit session key (Base64): " + encodedKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
