
package gasStation;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author tirth
 */
public class GasStation extends Application {
    
      static Stage stage1 = new Stage();
      static Stage stage2 = new Stage();
      static Stage stage3 = new Stage();
      static Stage stage4 = new Stage();
      static Stage stage5 = new Stage();
       //static Window1Controller w1;
       
       
    @Override
    public void start(Stage stage) throws Exception {
        Parent root1 = FXMLLoader.load(getClass().getResource("gasStation.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("gasStation_2.fxml"));
        Parent root3 = FXMLLoader.load(getClass().getResource("gasStation_3.fxml"));
        Parent root4 = FXMLLoader.load(getClass().getResource("gasStation_4.fxml"));
        Parent root5 = FXMLLoader.load(getClass().getResource("gasStation_5.fxml"));
       
       // FXMLLoader r1 = new FXMLLoader(getClass()
         //       .getResource("Window1.fxml"));
        
        
       
        
        
       /* Parent root1 = r1.load();
        //Parent root2 = r2.load();
        //Parent root3 = r3.load();
        
        //w1 = r1.getController();
        //w2 = r2.getController();
        //w3 = r3.getController();
       */
        
        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scene3 = new Scene(root3);
        Scene scene4 = new Scene(root4);
        Scene scene5 = new Scene(root5);

        /*
        Stage stage1 = new Stage();
        Stage stage2 = new Stage();
        Stage stage3 = new Stage();
        */
         
        
        stage1.setScene(scene1);
        stage2.setScene(scene2);
        stage3.setScene(scene3);
        stage4.setScene(scene4);
        stage5.setScene(scene5);
        
        stage1.show();
        stage2.show();
        stage3.show();
        stage4.show();
        stage5.show();
        
        showWindow1();
    }
    
    public static void showWindow1()
    {
        stage1.show();
        stage2.hide();
        stage3.hide();
        stage4.hide();
        stage5.hide();
       // w1.onShow();
    }
    
    public static void showWindow2()
    {
        stage2.show();
        stage1.hide();
        stage3.hide();
        stage4.hide();
        stage5.hide();
       // w2.onShow();
    }
    
    public static void showWindow3()
    {
        stage3.show();
        stage1.hide();
        stage2.hide();
        stage4.hide();
        stage5.hide();
      //  w3.onShow();
    }
    
    public static void showWindow4()
    {
        stage4.show();
        stage1.hide();
        stage2.hide();
        stage3.hide();
        stage5.hide();
      //  w3.onShow();
    }
    
    public static void showWindow5()
    {
        stage5.show();
        stage1.hide();
        stage2.hide();
        stage3.hide();
        stage4.hide();
      //  w3.onShow();
    }
    

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
