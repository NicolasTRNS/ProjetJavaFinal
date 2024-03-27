package com.example.listlang;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHasher {

    public static String hashPassword(String password) {
        try {
            // Créer un objet MessageDigest avec l'algorithme SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Appliquer le hachage sur le mot de passe
            byte[] hashedBytes = digest.digest(password.getBytes());

            // Convertir le tableau de bytes en une représentation hexadécimale
            StringBuilder hexString = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                String hex = Integer.toHexString(0xff & hashedByte);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // Retourner le hash du mot de passe
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Gérer l'exception NoSuchAlgorithmException
            return null;
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation de la méthode hashPassword
        String password = "mot_de_passe_a_hasher";
        String hashedPassword = hashPassword(password);
        System.out.println("Mot de passe hashé : " + hashedPassword);
    }
}
