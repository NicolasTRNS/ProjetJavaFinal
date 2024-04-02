package com.example.listlang;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {

    public Button inventaire;
    public Button btnPasserAVente;

    @FXML
    private ComboBox<String> taskSelected9;

    @FXML
    private Label PlantesVendues;

    @FXML
    private Button btnVendre;


    @FXML
    protected void vendrePlantes() {
        // Code pour vendre les plantes

        // Affichage du message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Vente de plantes");
        alert.setHeaderText("Les plantes ont été vendues !");
        alert.setContentText(null); // Assurez-vous que le texte du contenu est null pour éviter de l'afficher à nouveau
    }


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
        int selectedIndex = random.nextInt(taskSelected1.getItems().size());
        taskSelected1.getSelectionModel().select(selectedIndex);
        taskSelected2.getSelectionModel().select(selectedIndex); // Sélection basée sur le même index que taskSelected1

        taskSelected3.getSelectionModel().select(random.nextInt(taskSelected3.getItems().size()));
        taskSelected4.getSelectionModel().select(random.nextInt(taskSelected4.getItems().size()));

        // Assurez-vous que taskSelected9 sélectionne un élément différent de taskSelected3
        int selectedIndex9;
        do {
            selectedIndex9 = random.nextInt(taskSelected9.getItems().size());
        } while (selectedIndex9 == selectedIndex);
        taskSelected9.getSelectionModel().select(selectedIndex9);

        // Liaison de l'action du bouton btnVendre avec l'actualisation de PlantesVendues
        btnVendre.setOnAction(event -> PlantesVendues.setText("New label text"));
    }


    @FXML
    private void passerAVente() {
        myTab.getSelectionModel().select(2); // Sélectionne l'onglet "Vente"
    }


    @FXML
    protected void changeToModify() {
        // Méthode pour charger les données à modifier
    }

    @FXML
    protected void quitter() {
        // Méthode pour quitter l'application
        Platform.exit(); // Cette ligne permet de fermer l'application
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
    protected void verifierInventaire() {
        // Méthode pour rediriger vers l'onglet "Inventaire" lorsque le bouton "Vérifier l'inventaire" est cliqué
        myTab.getSelectionModel().select(1); // Sélectionne l'onglet "Inventaire"
    }
}