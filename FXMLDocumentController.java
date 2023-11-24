package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class FXMLDocumentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView img;

    @FXML
    private Label label;

    @FXML
   public void AdminButtonClicked(ActionEvent event) throws IOException {
       Parent root=FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
       Scene tableViewScene=new Scene(root);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(tableViewScene);
       window.show();
       
       
       
       
        
        

    }
   

    @FXML
    void CustomarButtonClicked(ActionEvent event) throws IOException {
         Parent root1=FXMLLoader.load(getClass().getResource("CustomerInfo.fxml"));
       Scene tableViewScene=new Scene(root1);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(tableViewScene);
       window.show();
       
        

    }

    @FXML
    void initialize() {
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }

}


    
 
  
    

