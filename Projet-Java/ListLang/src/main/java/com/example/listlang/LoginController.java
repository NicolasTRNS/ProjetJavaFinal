package com.example.listlang;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button btnConnexion;

    @FXML
    private Label loginMessage;

    // Méthode appelée lorsqu'on clique sur le bouton de connexion
    @FXML
    private void handleLoginAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Vérifier si l'utilisateur existe dans la base de données
        if (checkUserExists(username, password)) {
            loginMessage.setText("Connexion réussie !");
        } else {
            // Si l'utilisateur n'existe pas, l'ajouter à la base de données
            if (registerNewUser(username, password)) {
                loginMessage.setText("Inscription réussie !");
            } else {
                loginMessage.setText("Identifiants incorrects. Veuillez réessayer.");
            }
        }
    }

    // Vérifier si l'utilisateur existe dans la base de données
    private boolean checkUserExists(String username, String password) {
        // Remplacer cette logique par votre propre logique de vérification dans la base de données
        // Cette méthode devrait interroger la base de données pour vérifier si l'utilisateur existe
        // en utilisant les identifiants fournis.
        // Retourne true si l'utilisateur existe, sinon false.
        return false;
    }

    // Ajouter un nouvel utilisateur à la base de données
    private boolean registerNewUser(String username, String password) {
        // Remplacer cette logique par votre propre logique d'ajout dans la base de données
        // Cette méthode devrait insérer un nouvel utilisateur avec les identifiants fournis dans la base de données.
        // Retourne true si l'ajout réussit, sinon false.
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        DatabaseMetaData Database = null;
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void handleInscriptionAction(ActionEvent actionEvent) {
    }
}
