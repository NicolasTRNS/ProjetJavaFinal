package com.example.listlang;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class DatabaseManager {

    // Méthode pour hasher le mot de passe avec l'algorithme SHA-256
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Méthode pour vérifier les informations d'identification
    public static boolean verifyCredentials(String username, String password) {
        // Connectez-vous à la base de données et vérifiez les informations d'identification
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx", "root", "password");
            PreparedStatement statement = connection.prepareStatement("SELECT password FROM users WHERE username = ?");
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String hashedPassword = resultSet.getString("password");
                String hashedInputPassword = hashPassword(password);
                return hashedInputPassword.equals(hashedPassword);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Méthode pour enregistrer un nouvel utilisateur
    public static void registerUser(String username, String password) {
        // Connectez-vous à la base de données et enregistrez les informations d'identification
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx", "root", "password");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
            statement.setString(1, username);
            statement.setString(2, hashPassword(password));
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
