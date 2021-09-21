package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class JeopardyController {

    @FXML
    private Button btn;
    
    @FXML
    private Label label;

    @FXML
    void sayHello(ActionEvent event) {
    	
    	label.setText("Hello!");
    	//System.out.println("Hello!");
    }

}
