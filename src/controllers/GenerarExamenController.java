/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author hectorleon
 */
public class GenerarExamenController implements Initializable {
    
    public Stage stage = new Stage();
    @FXML
    private Label label;
    @FXML
    private Button returnButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Mate");
    }
    public final void DropMenu(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Mate");
    }
    
    @FXML
    private void goBack(ActionEvent event) 
        throws IOException
    {
        this.stage = ((Stage)this.returnButton.getScene().getWindow());
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        this.stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}