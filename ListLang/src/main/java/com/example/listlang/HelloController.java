package com.example.listlang;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ComboBox<String> taskSelected9;

    @FXML
    private Label PlantesVendues;

    @FXML
    private Button btnVendre;

    @FXML
    private Label welcomeText;


    @FXML
    protected void vendrePlantes(ActionEvent event) {
        // Code pour vendre les plantes

        // Affichage du message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Vente de plantes");
        alert.setHeaderText("Les plantes ont été vendues !");
        alert.setContentText(null); // Assurez-vous que le texte du contenu est null pour éviter de l'afficher à nouveau
        Optional<ButtonType> buttonType = alert.showAndWait();
    }


    @FXML
    private TextField task;

    @FXML
    private CheckBox isfinish;

    @FXML
    private ComboBox<String> taskSelected;

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
        btnVendre.setOnAction(event -> {
            PlantesVendues.setText("New label text");
        });
    }

    @FXML
    private void registerUser(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Hasher le mot de passe avant de le stocker dans la base de données
        String hashedPassword = PasswordHasher.hashPassword(password);

        // Enregistrer l'utilisateur dans la base de données avec le nom d'utilisateur et le mot de passe haché
        // Ici, vous devrez écrire du code pour enregistrer l'utilisateur dans votre base de données
        // UserRepository.getInstance().registerUser(username, hashedPassword);

        // Une fois l'inscription réussie, charger le fichier FXML hello-view.fxml
        loadHelloViewFXML();
    }

    @FXML
    private void connexionAction(ActionEvent event) {
        try {
            // Charger le fichier FXML connexion.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml connexion.fxml"));
            Parent root = fxmlLoader.load();

            // Créer une nouvelle scène avec le contenu du fichier FXML chargé
            Scene scene = new Scene(root);

            // Obtenir la référence de la fenêtre actuelle à partir de l'événement
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Définir la nouvelle scène sur la fenêtre
            stage.setScene(scene);
            stage.setTitle("Connexion"); // Titre de la nouvelle fenêtre

            // Afficher la fenêtre
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadHelloViewFXML() {
        try {
            // Charger le fichier FXML hello-view.fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = fxmlLoader.load();

            // Créer une nouvelle scène avec le contenu du fichier FXML chargé
            Scene scene = new Scene(root);

            // Obtenir la référence de la fenêtre actuelle à partir de l'événement
            Stage stage = (Stage) btnVendre.getScene().getWindow();

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
    protected void quitter() {
        // Méthode pour quitter l'application
        Platform.exit(); // Cette ligne permet de fermer l'application
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
    protected void changeToDelete() {
        // Méthode pour charger les données à supprimer
    }

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
}
