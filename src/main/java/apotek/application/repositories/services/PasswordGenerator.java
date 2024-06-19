/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek.application.repositories.services;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dukhaan
 */
public class PasswordGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int PASSWORD_LENGTH = 8; 

    private static Set<String> usedPasswords = new HashSet<>();

    // Randomize Password
    public static String generateRandomPassword() {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        while (password.length() < PASSWORD_LENGTH) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();
    }
    
    public static boolean isPasswordUsed(String password) {
        return usedPasswords.contains(password);
    }

    public static void addUsedPassword(String password) {
        usedPasswords.add(password);
    }
}

