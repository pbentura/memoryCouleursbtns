package com.example.tp7memory;

import Clases.Carte;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

public class MemoryController {
    int indiceBoutonClique;
    Carte carteCliquee;

    ArrayList<Carte> lesCartes;
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

    // TODO: Creer les cartes et les assigner aux labels
    public void initialize(URL location, ResourceBundle resources) {
        lesCartes = new ArrayList<Carte>();


    }

    public boolean cartRetournee() {
        for (Carte carte : lesCartes) {
            if (carteCliquee.) {
                return true;
            }
        }
        return false;
    }

    public void onBtnClicked(Event event) {
        Button btnClique = (Button) event.getSource();

        // Récupérer l'indice ou l'identifiant du bouton cliqué
        indiceBoutonClique = Integer.parseInt(btnClique.getId().substring(3));

        // Récupérer la carte associée
        carteCliquee = lesCartes.get(indiceBoutonClique);

        for (Button btn : new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16}) {
            if (btn.)
        }
    }
}