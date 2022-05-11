
package kuis;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import DBHelper.DBHandler;
import oven.model.oven;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnSave;

    @FXML
    private ComboBox<?> cbPembayaran;

    @FXML
    private DatePicker dpTanggalBeli;

    @FXML
    private TextField id;

    @FXML
    private ToggleGroup merk;

    @FXML
    private RadioButton rdCosmos;

    @FXML
    private RadioButton rdPhilips;

    @FXML
    private RadioButton rdSharp;

    @FXML
    private TextField tfNama;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println(id.getText());
        System.out.println(tfNama.getText());
        System.out.println(dpTanggalBeli.getValue().toString());
        String merk ="";
        if(rdCosmos.isSelected())
            merk = rdCosmos.getText();
        if(rdPhilips.isSelected())
            merk = rdPhilips.getText();
        if(rdSharp.isSelected())
            merk = rdSharp.getText();
        
        System.out.println(merk);
        System.out.println(cbPembayaran.getValue().toString());
        
        oven o = new oven (id.getText(),tfNama.getText(),dpTanggalBeli.getValue().toString(),
        merk,cbPembayaran.getValue().toString());
        
        DBHandler dh = new DBHandler("MYSQL");
        dh.addoven(o);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Cash");
        list.add("Nyicil");

        ObservableList items = FXCollections.observableArrayList(list);
        
        cbPembayaran.setItems(items);
    }    
    
}