/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasStation;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tirth
 */
public class GasStation_5Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextArea lbl1;
      
    @FXML
    private Label tax;
    
    @FXML
    private Label total;
    
    @FXML
    private Label subTotal;
    
    @FXML
    private Button btnPrint;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
           
            
            
        //Identifying the file 
        File myFile = new File("gasstation.txt");
        //Check if the file exists
        
        //if(!myFile.exists()){
        //if does not exists then stop
        
           // throw new FileNotFoundException();
       // }
        //open the file to read
        FileReader fr = new FileReader(
                    myFile.getAbsoluteFile());
        
        BufferedReader br = new BufferedReader(fr);
        //Read our information from the file
        
        String s,str = "";
        int subtotal = 0;
        while( ( s = br.readLine() ) != null ){
        
            str = str + s + "\n";
            subtotal = subtotal + 2;
//System.out.println(s);
        }
        //System.out.print(s);
        subtotal  = Integer.parseInt(str.substring(0, str.indexOf("$"))) + (subtotal-2);
        lbl1.setText(str);
        //System.out.println(filltxt.getText());
        //System.out.print(gas);
        int tax1 = (int) (subtotal*0.13);
        subTotal.setText("$" +Integer.toString(subtotal));
        tax.setText("$" +Integer.toString(tax1));
        total.setText("$" +Integer.toString((int) (subtotal + tax1)));
        //close
        br.close();
        fr.close();
        
        }catch(IOException e){
            
            System.out.println(e);
        }
    
    
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
   public void toprinter(ActionEvent event)
    
    {
        ChoiceDialog d = new ChoiceDialog(Printer.getDefaultPrinter(), Printer.getAllPrinters());
        PrinterJob job= PrinterJob.createPrinterJob();
            if(job.showPrintDialog(d.getOwner()) && job.printPage(lbl1)){
                job.endJob();
            }
    }
    
    
      
    }   
     

