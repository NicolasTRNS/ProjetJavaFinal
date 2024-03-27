package com.example.listlang;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Chargement de la page de connexion
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml connexion.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}