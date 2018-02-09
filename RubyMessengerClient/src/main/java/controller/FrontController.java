package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FrontController implements Initializable {
    
    @FXML
    private Label noAccount;
    
    @FXML
    TextField username;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        noAccount.getStyleClass().add("label");
        username.getStyleClass().add("username");
    }
    
    // abdelfata7
    
    // khaled
}