package com.example.lab3;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HelloController {

    public Button btnMain;
    public TextField txtLicznik;
    int clickCounter = 0;



    public void onBtnAction(ActionEvent actionEvent){
        System.out.println("Klkniecie nr " + ++clickCounter);
        if (clickCounter == 1)
        btnMain.setText("I jeszcze raz");
        txtLicznik.setText(String.valueOf(clickCounter));
}
}