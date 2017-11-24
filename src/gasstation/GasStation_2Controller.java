/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasStation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tirth
 */
public class GasStation_2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField filltxt;
    
    @FXML
    private TextField totalTXT;
    
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
    
    @FXML
    public void order(){
        
        int fill = Integer.parseInt(filltxt.getText());
        int total = Integer.parseInt(totalTXT.getText());
        totalTXT.setText(Integer.toString(total-fill));
        
        try{
        
        
        File myFile = new File("gasstation.txt");
        //Check if the file exists
        if(!myFile.exists()){
        //if does not exists create it
            myFile.createNewFile();
        }
        //open the file to write
        FileWriter fw = new FileWriter(
                    myFile.getAbsoluteFile(),true);
        //open the file to append
        //FileWriter fw = new FileWriter(
         //          myFile.getAbsoluteFile(),true);
        
        BufferedWriter bw = new BufferedWriter(fw);
        //write our information to the file
        bw.write(filltxt.getText() + "$ - GAS");
        bw.newLine();
        
        bw.close();
        fw.close();
        
        }catch(IOException e){
            System.out.println(e);
            
        }
    }
}
