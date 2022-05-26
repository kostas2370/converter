package com.mycompany.mavenproject5;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;


public class PrimaryController {


    
    @FXML
    private ChoiceBox<String> what,fromx,tox;
    @FXML 
    private TextField from_input,to_input;
   
    
    
    ObservableList<String> whats = FXCollections.observableArrayList("Αριθμοί","Βάρος","Μήκος","Όγκος");
    ObservableList<String> from_mhkos = FXCollections.observableArrayList("Μετρα","Χιλιομετρα","Εκατοστα","Μιλια");
    ObservableList<String> to_mhkos = FXCollections.observableArrayList("Μετρα","Χιλιομετρα","Εκατοστα","Μιλια");
   
    ObservableList<String> from_varos = FXCollections.observableArrayList("κιλα","γραμμάρια","λιβρες","τονος");
    ObservableList<String> to_varos = FXCollections.observableArrayList("κιλα","γραμμάρια","λιβρες","τονος");
    
    ObservableList<String> from_arithmos = FXCollections.observableArrayList("δυαδικο","οκταδικο","δεκαδικο","δεκαεξαδικο");
    ObservableList<String> to_arithmos = FXCollections.observableArrayList("δυαδικο","οκταδικο","δεκαδικο","δεκαεξαδικο");
    
    ObservableList<String> from_ogkos = FXCollections.observableArrayList("λιτρα","κυβικο μετρο","Γαλόνι");
    ObservableList<String> to_ogkos = FXCollections.observableArrayList("λιτρα","κυβικο μετρο","Γαλόνι");
    
    
    @FXML
    private void initialize(){
        to_input.setEditable(false);
        what.setValue(convertions.what);
        what.setItems(whats);
        from_input.setText("0");
        to_input.setText("0");
        if (what.getValue()=="Αριθμοί"){
           fromx.setItems(from_arithmos) ;
           tox.setItems(to_arithmos);
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        }
        else if(what.getValue()=="Βάρος"){
           fromx.setItems(from_varos) ; 
           tox.setItems(to_varos);
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        }
        
        else if(what.getValue()=="Μήκος"){
           fromx.setItems(from_mhkos) ; 
           tox.setItems(to_mhkos);
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        
        }
        else{
          fromx.setItems(from_ogkos) ; 
          tox.setItems(to_ogkos); 
          fromx.setValue(convertions.from);
          tox.setValue(convertions.to);
        }
     
    
    from_input.textProperty().addListener(new ChangeListener<String>() {
    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, 
        String newValue) {
        if (!newValue.matches("\\d*")) {
            from_input.setText(newValue.replaceAll("[^\\d]", ""));
        }
        
    }
});

    what.setOnAction((event) -> {
        
        
        convertions.what=what.getValue();
        what.setValue(convertions.what);
        if (what.getValue()=="Αριθμοί"){
           fromx.setItems(from_arithmos) ;
           tox.setItems(to_arithmos);
           convertions.from="δυαδικο";
           convertions.to="οκταδικο";
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        }
        else if(what.getValue()=="Βάρος"){
           fromx.setItems(from_varos) ; 
           tox.setItems(to_varos);
           convertions.from="κιλα";
           convertions.to="γραμμάρια";
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        }
        
        else if(what.getValue()=="Μήκος"){
           fromx.setItems(from_mhkos) ; 
           tox.setItems(to_mhkos);
           convertions.from="Μετρα";
           convertions.to="Μιλια";
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        
        }
        else{
          fromx.setItems(from_ogkos) ; 
          tox.setItems(to_ogkos); 
          convertions.from="λιτρα";
          convertions.to="Γαλόνι";
          fromx.setValue(convertions.from);
          tox.setValue(convertions.to);
        }
        
}); 
    
    
    
    
    };
    
        
        
    @FXML
    private void x1() throws IOException {
        convertions.what=what.getValue();
        what.setValue(convertions.what);
        if (what.getValue()=="Αριθμοί"){
           fromx.setItems(from_arithmos) ;
           tox.setItems(to_arithmos);
           convertions.from="δυαδικο";
           convertions.to="οκταδικο";
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        }
        else if(what.getValue()=="Βάρος"){
           fromx.setItems(from_varos) ; 
           tox.setItems(to_varos);
           convertions.from="κιλα";
           convertions.to="γραμμάρια";
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        }
        
        else if(what.getValue()=="Μήκος"){
           fromx.setItems(from_mhkos) ; 
           tox.setItems(to_mhkos);
           convertions.from="Μετρα";
           convertions.to="Μιλια";
           fromx.setValue(convertions.from);
           tox.setValue(convertions.to);
        
        }
        else{
          fromx.setItems(from_ogkos) ; 
          tox.setItems(to_ogkos); 
          convertions.from="λιτρα";
          convertions.to="Γαλόνι";
          fromx.setValue(convertions.from);
          tox.setValue(convertions.to);
        }
        
   
        
    }
   @FXML
   private void convert() throws IOException {
        String x =from_input.getText();
        String what = convertions.what;
        convertions.from= fromx.getValue();
        convertions.to=tox.getValue();
        
        if (what=="Αριθμοί"){
            if (convertions.from=="δεκαδικο" && convertions.to=="δυαδικο"){
                to_input.setText(convertions.dekadikos_to_diadikos(Integer.parseInt(x)));
            }else if(convertions.from=="δεκαδικο" && convertions.to=="οκταδικο"){
                to_input.setText(convertions.dekadikos_to_octal(Integer.parseInt(x)));
            }else if(convertions.from=="δεκαδικο" && convertions.to=="δεκαεξαδικο"){
                to_input.setText(convertions.dekadikos_to_hex(Integer.parseInt(x)));
                
                
            }else if(convertions.from=="δυαδικο" && convertions.to=="δεκαδικο"){
                to_input.setText(Integer.toString(convertions.diadikos_to_dekadikos(x)));
            }else if(convertions.from=="δυαδικο" && convertions.to=="οκταδικο"){
                to_input.setText(convertions.diadikos_to_oktadikos(x));
            }else if(convertions.from=="δυαδικο" && convertions.to=="δεκαεξαδικο"){
                to_input.setText(convertions.diadikos_to_hex(x));
                
  
            }else if(convertions.from=="οκταδικο" && convertions.to=="δεκαδικο"){
                to_input.setText(convertions.octal_to_dekadiko(x));
            }else if(convertions.from=="οκταδικο" && convertions.to=="δυαδικο"){
                to_input.setText(convertions.octal_to_diadiko(x));
           }else if(convertions.from=="οκταδικο" && convertions.to=="δεκαεξαδικο"){
                to_input.setText(convertions.octal_to_hex(x));
           
           
           
           }else if(convertions.from=="δεκαεξαδικο" && convertions.to=="δυαδικο"){
                to_input.setText(convertions.hex_to_diadiko(x));   
        
            }else if(convertions.from=="δεκαεξαδικο" && convertions.to=="δεκαδικο"){
                to_input.setText(convertions.hex_to_dekadiko(x));  
           }else if(convertions.from=="δεκαεξαδικο" && convertions.to=="δεκαδικο"){
                to_input.setText(convertions.hex_to_octal(x));  
           }else{
           to_input.setText(x); 
           
           }
            
        
        
        }else if (what=="Βάρος"){
            if (convertions.from=="κιλα" && convertions.to=="γραμμάρια"){
                to_input.setText(convertions.kilos_to_grams(x));
            }else if(convertions.from=="κιλα" && convertions.to=="λιβρες"){
                to_input.setText(convertions.kilos_to_libres(x));
            }else if(convertions.from=="κιλα" && convertions.to=="τονος"){
                to_input.setText(convertions.kilos_to_tonos(x));
            }
            
            
            else if(convertions.from=="γραμμάρια" && convertions.to=="κιλα"){
                to_input.setText(convertions.grams_to_Kilos(x));
            }
            else if(convertions.from=="γραμμάρια" && convertions.to=="λιβρες"){
                to_input.setText(convertions.grams_to_libres(x));
            }
            else if(convertions.from=="γραμμάρια" && convertions.to=="τονος"){
                to_input.setText(convertions.grams_to_tons(x));
            }
            
            
           else if(convertions.from=="λιβρες" && convertions.to=="κιλα"){
                to_input.setText(convertions.libres_to_kilos(x));
            }
            else if(convertions.from=="λιβρες" && convertions.to=="γραμμάρια"){
                to_input.setText(convertions.libres_to_grams(x));
            }
            else if(convertions.from=="λιβρες" && convertions.to=="τονος"){
                to_input.setText(convertions.libres_to_tons(x));
            }
            
           else if(convertions.from=="τονος" && convertions.to=="κιλα"){
                to_input.setText(convertions.tons_to_kilos(x));
            }
            else if(convertions.from=="τονος" && convertions.to=="γραμμάρια"){
                to_input.setText(convertions.tons_to_grams(x));
            }
            else if(convertions.from=="τονος" && convertions.to=="λιβρες"){
                to_input.setText(convertions.tons_to_libres(x));
            }else{
                to_input.setText(x);
            
            }
        
        
        }else if(what=="Μήκος"){
            if (convertions.from=="Μετρα" && convertions.to=="Χιλιομετρα"){
                to_input.setText(convertions.metre_to_km(x));
            }else if(convertions.from=="Μετρα" && convertions.to=="Εκατοστα"){
                to_input.setText(convertions.metre_to_ekatosta(x));
            }else if(convertions.from=="Μετρα" && convertions.to=="Μιλια"){
                to_input.setText(convertions.metre_to_milia(x));
            }
            
            
            else if (convertions.from=="Εκατοστα" && convertions.to=="Μετρα"){
                to_input.setText(convertions.ekatosta_to_metres(x));
            }else if(convertions.from=="Εκατοστα" && convertions.to=="Χιλιομετρα"){
                to_input.setText(convertions.ekatosta_to_km(x));
            }else if(convertions.from=="Εκατοστα" && convertions.to=="Μιλια"){
                to_input.setText(convertions.ekatosta_to_miles(x));
            }
            
            
            else if (convertions.from=="Μιλια" && convertions.to=="Μετρα"){
                to_input.setText(convertions.miles_to_metre(x));
            }else if(convertions.from=="Μιλια" && convertions.to=="Χιλιομετρα"){
                to_input.setText(convertions.miles_to_km(x));
            }else if(convertions.from=="Μιλια" && convertions.to=="Εκατοστα"){
                to_input.setText(convertions.miles_to_ekatosta(x));
            }
            
            
            else if (convertions.from=="Χιλιομετρα" && convertions.to=="Μετρα"){
                to_input.setText(convertions.km_to_metres(x));
            }else if(convertions.from=="Χιλιομετρα" && convertions.to=="Μιλια"){
                to_input.setText(convertions.km_to_miles(x));
            }else if(convertions.from=="Χιλιομετρα" && convertions.to=="Εκατοστα"){
                to_input.setText(convertions.km_to_ekatosta(x));
            }else{
                to_input.setText(x);
            }
            
        
        
        
        
        }else{
            if (convertions.from=="λιτρα" && convertions.to=="κυβικο μετρο"){
                to_input.setText(convertions.litre_to_m3(x));
        
        
        }else if (convertions.from=="λιτρα" && convertions.to=="Γαλόνι"){
                to_input.setText(convertions.litre_to_galonia(x));
        
        
        }else if (convertions.from=="Γαλόνι" && convertions.to=="κυβικο μετρο"){
                to_input.setText(convertions.galonia_to_m3(x));
            
        }else if (convertions.from=="Γαλόνι" && convertions.to=="λιτρα"){
                to_input.setText(convertions.galonia_to_litre(x));
        }
        
        else if (convertions.from=="κυβικο μετρο" && convertions.to=="λιτρα"){
                to_input.setText(convertions.m3_to_litre(x));
        }
        else if (convertions.from=="κυβικο μετρο" && convertions.to=="Γαλόνι"){
                to_input.setText(convertions.m3_to_galonia(x));
        }else{
                to_input.setText(x);
        
        
        }
        }}}
