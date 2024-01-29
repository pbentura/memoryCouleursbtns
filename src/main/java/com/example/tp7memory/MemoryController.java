package com.example.tp7memory;

import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;

public class MemoryController implements Initializable {
    int indiceBoutonClique;

    ArrayList<Color> couleursDisponibles;

    Button boutonClique;


    @javafx.fxml.FXML
    private Button btn1;
    @javafx.fxml.FXML
    private Button btn11;
    @javafx.fxml.FXML
    private Button btn12;
    @javafx.fxml.FXML
    private Button btn13;
    @javafx.fxml.FXML
    private Button btn14;
    @javafx.fxml.FXML
    private Button btn15;
    @javafx.fxml.FXML
    private Button btn16;
    @javafx.fxml.FXML
    private Button btn10;
    @javafx.fxml.FXML
    private Button btn9;
    @javafx.fxml.FXML
    private Button btn8;
    @javafx.fxml.FXML
    private Button btn4;
    @javafx.fxml.FXML
    private Button btn7;
    @javafx.fxml.FXML
    private Button btn3;
    @javafx.fxml.FXML
    private Button btn6;
    @javafx.fxml.FXML
    private Button btn5;
    @javafx.fxml.FXML
    private Button btn2;
    @javafx.fxml.FXML
    private GridPane grdPan;

    public void initialize(URL location, ResourceBundle resources) {

        // Initialiser la liste de couleurs disponibles
        couleursDisponibles = new ArrayList<>();
        couleursDisponibles.add(Color.BLUE);
        couleursDisponibles.add(Color.RED);
        couleursDisponibles.add(Color.GREEN);
        couleursDisponibles.add(Color.PURPLE);
        couleursDisponibles.add(Color.PINK);
        couleursDisponibles.add(Color.WHITE);
        couleursDisponibles.add(Color.BLACK);
        couleursDisponibles.add(Color.LIGHTBLUE);

    }

    private void changerCouleurBouton(Button bouton, Color couleur) {
        bouton.setStyle("-fx-background-color: #" + couleur.toString().substring(2) + ";");
    }
    @javafx.fxml.FXML
    public void onBtnClicked(Event event) {
        Random random = new Random();
        int index = random.nextInt(couleursDisponibles.size());
        Color couleurAleatoire = couleursDisponibles.get(index);

        // changer a couleur du bouton cliqué
        Button bouton = (Button) event.getSource();
        changerCouleurBouton(bouton, couleurAleatoire);


    }
}