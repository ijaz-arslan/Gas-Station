/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasStation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author tirth
 */
public class GasStationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
//    public void addLogo(){
//    
//        
//        Image img = new Image("images\\cstore.png");
//        ImageView imv = new ImageView(img);
//        imv.setFitHeight(50);
//        imv.setFitWidth(50);
//        
//        StackPane sp = new StackPane();
//        
//        Image backImg = new Image("images\\convenience-store.jpg");
//        ImageView backImv = new ImageView(backImg);
//        backImv.setFitHeight(50);
//        backImv.setFitWidth(50);
//        
//        sp.getChildren().add(backImv);
//        
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void show1(){
        //LogicClass.message = "Previous Window was 1";
        GasStation.showWindow1();
    }
    
    @FXML
    public void show2(){
        //LogicClass.message = "Previous Window was 1";
        GasStation.showWindow2();
    }
    
    @FXML
    public void show3(){
        //LogicClass.message = "Previous Window was 1";
        GasStation.showWindow3();
    }
    
    @FXML
    public void show4(){
        //LogicClass.message = "Previous Window was 1";
        GasStation.showWindow4();
    }
    
    
   @FXML
    public void show5(){
        //LogicClass.message = "Previous Window was 1";
        GasStation.showWindow5();
      
    }
    
    
    
}
