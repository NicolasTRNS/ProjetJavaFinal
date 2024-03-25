package com.example.listlang;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

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
            redirectToHelloView(event);
        } else {
            loginMessage.setText("Identifiants incorrects. Veuillez réessayer.");
        }
    }

    // Méthode appelée lorsqu'on clique sur le bouton S'inscrire
    @FXML
    private void handleInscriptionAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Vérifier si les champs ne sont pas vides
        if (username.isEmpty() || password.isEmpty()) {
            loginMessage.setText("Veuillez remplir tous les champs.");
        } else {
            // Vérifier si l'utilisateur existe déjà dans la base de données
            if (checkUserExists(username, password)) {
                loginMessage.setText("L'utilisateur existe déjà !");
            } else {
                // Enregistrer le nouvel utilisateur dans la base de données
                registerNewUser(username, password);
                loginMessage.setText("Inscription réussie !");
                redirectToHelloView(event);
            }
        }
    }

    // Vérifier si l'utilisateur existe dans la base de données
    private boolean checkUserExists(String username, String password) {
        // Votre logique pour vérifier si l'utilisateur existe va ici
        return false;
    }

    // Ajouter un nouvel utilisateur à la base de données
    private void registerNewUser(String username, String password) {
        // Votre logique pour enregistrer un nouvel utilisateur va ici
    }

    // Redirection vers l'application principale (hello-view.fxml)
    private void redirectToHelloView(ActionEvent event) {
        try {
            // Charger le fichier FXML hello-view.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = fxmlLoader.load();

            // Créer une nouvelle scène avec le contenu du fichier FXML chargé
            Scene scene = new Scene(root);

            // Obtenir la référence de la fenêtre actuelle à partir de l'événement
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Définir la nouvelle scène sur la fenêtre
            stage.setScene(scene);
            stage.setTitle("JardinoTech"); // Titre de la nouvelle fenêtre

            // Afficher la fenêtre
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
