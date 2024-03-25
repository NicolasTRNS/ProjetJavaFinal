package com.example.listlang;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Random;

public class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField task;

    @FXML
    private CheckBox isfinish;

    @FXML
    private ComboBox<String> taskSelected;

    @FXML
    private ComboBox<String> taskSelected9;

    @FXML
    private TextField taskSelectedText;

    @FXML
    private CheckBox isfinishSelected;

    @FXML
    private ListView<String> taskList;

    @FXML
    private ComboBox<String> taskSelectedDelete;

    @FXML
    private ComboBox<String> taskSelected1;

    @FXML
    private ComboBox<String> taskSelected2;

    @FXML
    private ComboBox<String> taskSelected3;

    @FXML
    private ComboBox<String> taskSelected4;

    @FXML
    private TabPane myTab;

    @FXML
    private Button btnPasserAVente;

    @FXML
    private Button btnVendre;

    @FXML
    private Button btnConnexion;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialiser les ComboBox avec les données nécessaires
        taskSelected1.getItems().addAll("Sofia Ramirez", "Xavier Johnson", "Jasmine Patel");
        taskSelected2.getItems().addAll("sofia.ramirez@gmail.com", "xavier.johnson@gmail.com", "jasmine.pastel@gmail.com");
        taskSelected3.getItems().addAll("Géranium", "Rosier", "Cactus");
        taskSelected4.getItems().addAll("1", "2", "3", "4", "5");
        taskSelected9.getItems().addAll("Géranium", "Rosier", "Cactus");

        // Sélection aléatoire des valeurs
        Random random = new Random();
        taskSelected1.getSelectionModel().select(random.nextInt(taskSelected1.getItems().size()));
        taskSelected2.getSelectionModel().select(random.nextInt(taskSelected2.getItems().size()));
        taskSelected3.getSelectionModel().select(random.nextInt(taskSelected3.getItems().size()));
        taskSelected4.getSelectionModel().select(random.nextInt(taskSelected4.getItems().size()));
        taskSelected9.getSelectionModel().select(random.nextInt(taskSelected4.getItems().size()));
    }

    @FXML
    private void connexionAction(ActionEvent event) {
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
            stage.setTitle("Hello World"); // Titre de la nouvelle fenêtre

            // Afficher la fenêtre
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void passerAVente(ActionEvent event) {
        myTab.getSelectionModel().select(2); // Sélectionne l'onglet "Vente"
    }

    @FXML
    protected void addTask() {
        // Méthode pour ajouter une tâche
    }

    @FXML
    protected void modifyTask() {
        // Méthode pour modifier une tâche
    }

    @FXML
    protected void changeToModify() {
        // Méthode pour charger les données à modifier
    }

    @FXML
    public void vendrePlantes(ActionEvent event) {
        plantsSoldLabel.get().setVisible(true);
    }

    @FXML
    public final ThreadLocal<Label> plantsSoldLabel = new ThreadLocal<>();

    @FXML
    protected void changeToDelete() {
        // Méthode pour charger les données à supprimer
    }

    @FXML
    private Label PlantesVendues;

    @FXML
    protected void selectionnerOngletInventaire() {
        // Méthode pour sélectionner l'onglet "Inventaire"
        myTab.getSelectionModel().select(1); // L'index 1 correspond à l'onglet "Inventaire"
    }

    @FXML
    protected void selectionnerOngletClient() {
        // Méthode pour sélectionner l'onglet "Client"
        myTab.getSelectionModel().select(0); // L'index 0 correspond à l'onglet "Client"
    }

    @FXML
    protected void selectionnerOngletVente() {
        // Méthode pour sélectionner l'onglet "Vente"
        myTab.getSelectionModel().select(2); // L'index 2 correspond à l'onglet "Vente"
    }

    @FXML
    protected void changeToList() {
        // Méthode pour charger la liste des tâches
    }

    @FXML
    protected void selectedTask() {
        // Méthode pour afficher les détails d'une tâche sélectionnée
    }

    @FXML
    public void deleteTask() {
        // Méthode pour supprimer une tâche
    }

    @FXML
    protected void verifierInventaire(ActionEvent event) {
        // Méthode pour rediriger vers l'onglet "Inventaire" lorsque le bouton "Vérifier l'inventaire" est cliqué
        myTab.getSelectionModel().select(1); // Sélectionne l'onglet "Inventaire"
    }

    @FXML
    public void handleLoginAction(ActionEvent actionEvent) {
    }
}
