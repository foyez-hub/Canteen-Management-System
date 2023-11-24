/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CustomerInfoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
      @FXML
    void CustomerPageBackBt(ActionEvent event) throws IOException {
         Parent root1=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       Scene tableViewScene=new Scene(root1);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(tableViewScene);
       window.show();
       
        

    }
    
      @FXML
    void CustomerPageRegistrationkBt(ActionEvent event) throws IOException {
         Parent root1=FXMLLoader.load(getClass().getResource("CustomerRegistration.fxml"));
       Scene tableViewScene=new Scene(root1);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(tableViewScene);
       window.show();
       
        

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
