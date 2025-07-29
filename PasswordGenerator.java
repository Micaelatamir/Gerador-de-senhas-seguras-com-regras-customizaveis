import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{};:,.<>?";

    private SecureRandom random = new SecureRandom();

    public String generatePassword(int length, boolean useUpper, boolean useLower, boolean useNumbers, boolean useSpecial) {
        StringBuilder charPool = new StringBuilder();

        if (useUpper) charPool.append(UPPERCASE);
        if (useLower) charPool.append(LOWERCASE);
        if (useNumbers) charPool.append(NUMBERS);
        if (useSpecial) charPool.append(SPECIAL_CHARS);

        if (charPool.length() == 0) {
            throw new IllegalArgumentException("Pelo menos uma categoria de caracteres deve ser selecionada!");
        }
         StringBuilder password = new StringBuilder();

        // Garante que pelo menos um de cada categoria selecionada entre na senha
        if (useUpper) password.append(randomChar(UPPERCASE));
        if (useLower) password.append(randomChar(LOWERCASE));
        if (useNumbers) password.append(randomChar(NUMBERS));
        if (useSpecial) password.append(randomChar(SPECIAL_CHARS));

        // Preenche o restante da senha
        for (int i = password.length(); i < length; i++) {
            password.append(randomChar(charPool.toString()));
        }

        // Embaralha a senha para não ficar previsível
        return shuffleString(password.toString());
    }

     private char randomChar(String pool) {
        int index = random.nextInt(pool.length());
        return pool.charAt(index);
    }

     private String shuffleString(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int randomIndex = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }
        return new String(chars);
    }
      public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();

        int length = 12;
        boolean useUpper = true;
        boolean useLower = true;
        boolean useNumbers = true;
        boolean useSpecial = true;

        String password = generator.generatePassword(length, useUpper, useLower, useNumbers, useSpecial);
        System.out.println("Senha gerada: " + password);
    }
}



    

 
    

