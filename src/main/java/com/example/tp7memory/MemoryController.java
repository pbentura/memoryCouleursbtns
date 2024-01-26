package com.example.tp7memory;

import Clases.Carte;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class MemoryController {
    int indiceBoutonClique;
    Carte carteCliquee;

    ArrayList<Carte> lesCartes;
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

    public void initialize(URL location, ResourceBundle resources) {

        // Initialiser la liste de couleurs disponibles
        couleursDisponibles = new ArrayList<>();
        lesCartes = new ArrayList<>();
        couleursDisponibles.add(Color.BLUE);
        couleursDisponibles.add(Color.RED);
        couleursDisponibles.add(Color.GREEN);
        couleursDisponibles.add(Color.PURPLE);
        couleursDisponibles.add(Color.PINK);
        couleursDisponibles.add(Color.WHITE);
        couleursDisponibles.add(Color.BLACK);
        couleursDisponibles.add(Color.LIGHTBLUE);

        for (Color couleur : couleursDisponibles) {
            lesCartes.add(new Carte(couleur.toString()));
            lesCartes.add(new Carte(couleur.toString()));
        }

        // Mélanger les cartes
        Collections.shuffle(lesCartes);
    }

    private void changerCouleurBouton(Button bouton, Color couleur) {
        bouton.setStyle("-fx-background-color: #" + couleur.toString().substring(2, 8));
    }
    @javafx.fxml.FXML
    public void onBtnClicked(Event event) {
        boutonClique = (Button) event.getSource();

        // Récupérer l'indice du bouton clique
        indiceBoutonClique = boutonClique.getId().charAt(boutonClique.getId().length() - 1) - '0';

        // Récupérer la carte cliquée
        Carte carteCliquee = lesCartes.get(indiceBoutonClique);

        // Changer la couleur du bouton clique
        for (Button bouton : new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16}) {
            changerCouleurBouton(bouton, couleursDisponibles.get(0));
        }

    }
}