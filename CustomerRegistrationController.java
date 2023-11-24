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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CustomerRegistrationController implements Initializable {

   
    
        @FXML
    private PasswordField Password;
        
         @FXML
    private TextField FullName;
          @FXML
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    public void WhenCheckBoxChecked(){
        
        //Password.setText(Password.getText());
        System.out.println(Password.getText());
        
    }
   
    
     @FXML
    void CustomerRegBackBtClicked(ActionEvent event) throws IOException {
         Parent root1=FXMLLoader.load(getClass().getResource("CustomerInfo.fxml"));
       Scene tableViewScene=new Scene(root1);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(tableViewScene);
       window.show();
       
        

    }
    
    
//          @FXML
//    void CustomerRegloginBt(ActionEvent event) throws IOException {
//         Parent root1=FXMLLoader.load(getClass().getResource("CustomerInfo.fxml"));
//       Scene tableViewScene=new Scene(root1);
//       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
//       window.setScene(tableViewScene);
//       window.show();
//       
//        
//
//    }
            
            
    
}
