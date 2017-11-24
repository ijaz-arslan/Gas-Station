/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasStation;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author tirth
 */
public class GasStation_3Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button kbtn;
    
    @FXML
    private Button wlbl;
    
    @FXML
    private Button tlbl;
    
    @FXML
    private Button dlbl;
    
    @FXML
    private Button slbl;
    
    @FXML
    private Button welbl;
    
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
    public void add(){
        
        writeToFile(kbtn);
     
    } 
    @FXML
    public void add1(){
        
        writeToFile(wlbl);
     
    } 
    @FXML
    public void add2(){
        
        writeToFile(tlbl);
     
    } 
    @FXML
    public void add3(){
        
        writeToFile(dlbl);
     
    } 
    @FXML
    public void add4(){
        
        writeToFile(slbl);
     
    } 
    @FXML
    public void add5(){
        
        writeToFile(welbl);
     
    } 
    
    
    
        public void writeToFile(Button btnName)
    {   
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
        String str = btnName.getText();
        bw.write(str);
        bw.newLine();
        
        bw.close();
        fw.close();
        
        }catch(IOException e){
            System.out.println(e);
            
        }
    }
        
       
        
        
    }
    

