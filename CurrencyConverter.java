import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CurrencyConverter extends Application
{

    String[] currencyUnits = {"Select","USD","Rupees","Pounds","Euros"};
        
     @Override  
        public void start(Stage primaryStage) throws Exception 
        {  
            // TODO Auto-generated method stub 
            
            //Pane 1
            GridPane p1 = new GridPane();
            
            //Label
            Label l1=new Label("Project Made By");
            l1.setFont(Font.font ("Arial Rounded MT Bold", 44));
            l1.setTextFill(Color.web("#f50202"));
            l1.setPadding(new Insets(0, 0, 20,0));
            Label l2=new Label("1.Devshekar Pattnaik 19BCE1292");
            l2.setFont(Font.font ("Arial Rounded MT Bold", 18));
            l1.setPadding(new Insets(0, 0, 10,0));
            Label l3=new Label("2.Nishnaat Nagar 19BCE1331");
            l3.setFont(Font.font ("Arial Rounded MT Bold", 18));
    
            
            //Adding Labels To the GridPane
            p1.add(l1,1,0);
            p1.add(l2,1,1);
            p1.add(l3,1,2);
            
            //GridPane Alignemnt
            p1.setAlignment(Pos.CENTER);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);
            
            
            //Pane2
            GridPane p2=new GridPane();
            GridPane p22=new GridPane();
            
            //Label
            Label t=new Label("CURRENCY CONVERTER");
            t.setPadding(new Insets(0, 0, 20,0));
            Label l4=new Label("Convert From");
            Label l5=new Label("Convert to");
            t.setFont(Font.font ("Arial Rounded MT Bold", 28));
            l4.setFont(Font.font ("Arial Rounded MT Bold", 18));
            l5.setFont(Font.font ("Arial Rounded MT Bold", 18));
    
            //ChoiceBox
            ChoiceBox c1=new ChoiceBox(FXCollections.observableArrayList(currencyUnits));
            ChoiceBox c2=new ChoiceBox(FXCollections.observableArrayList(currencyUnits));
            c1.setPrefHeight(40); 
            c1.setPrefWidth(150); 
            c2.setPrefHeight(40); 
            c2.setPrefWidth(150); 
    
            //TextArea
            TextArea ta1=new TextArea();
            TextArea ta2=new TextArea();
            ta1.setPrefHeight(40); 
            ta1.setPrefWidth(150);
            ta1.setFont(Font.font ("Arial Rounded MT Bold", 15));
            ta2.setPrefHeight(40); 
            ta2.setPrefWidth(150);
            ta2.setEditable(false);
            ta2.setFont(Font.font ("Arial Rounded MT Bold", 15));
    
    
    
            
            //Adding Text, Label, ChoiceBox & TextArea to GridPane
            p22.addRow(0,l4,l5);  
            p22.addRow(1,c1,c2);  
            p22.addRow(2,ta1,ta2); 
            p22.setHgap(100);
            p22.setVgap(30);
            p22.setAlignment(Pos.CENTER);
            
            //GridPane Alignment
            GridPane.setHalignment(t, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(l5, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(c1, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(c2, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(ta1, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(ta1, javafx.geometry.HPos.CENTER);
    
            //Final Pane2
            p2.addRow(0,t);  
            p2.addRow(1,p22);
            p2.setAlignment(Pos.CENTER);
            p2.setVgap(20);
    
    
    
            //Pane 3
            GridPane p3=new GridPane();
    
            Button btn1=new Button("Convert"); 
            Button btn2=new Button("Reset"); 
            btn1.setFont(Font.font ("Arial Rounded MT Bold", 21));
            btn2.setFont(Font.font ("Arial Rounded MT Bold", 21));
    
            GridPane.setHalignment(btn1, javafx.geometry.HPos.CENTER);
            GridPane.setHalignment(btn2, javafx.geometry.HPos.CENTER);
            p3.add(btn1,0,0);
            p3.add(btn2,1,0);
            p3.setHgap(120);
            p3.setAlignment(Pos.CENTER);
    
            
            //Separator
            Separator s1 = new Separator(Orientation.HORIZONTAL);
            Separator s2 = new Separator(Orientation.HORIZONTAL);
            
            //FinalGridPane
            GridPane root=new GridPane();
            root.add(p1,1,0);  
            root.add(s1,1,1);  
            root.add(p2,1,2);
            root.add(s2,1,3);  
            root.add(p3,1,4);
            root.setVgap(20);
            root.setAlignment(Pos.CENTER);
            root.setPadding(new Insets(20, 20, 20, 20));
            
            
    
            
            //Scene & Stage
            Scene scene=new Scene(root);      
            primaryStage.setTitle("Currency Converter");  
            primaryStage.setScene(scene);  
            primaryStage.show(); 
            
            //Conversion
            btn1.setOnAction(new EventHandler<ActionEvent>() 
            {
                @Override
                public void handle(ActionEvent arg0) 
                {  
                    // TODO Auto-generated method stub
                    String a=(String) c1.getValue();
                    String b=(String) c2.getValue();
                    double amount=Double.parseDouble(ta1.getText());
                    double final_amount;
                    
                    switch(a)
                    {
                        case "USD": switch(b)
                        {
                            case "USD": final_amount=amount;
                                break;
                            case "Rupees":final_amount = amount*73.14;
                                break;
                            case "Pounds":final_amount = amount*0.71;
                                break;
                            case "Euros":final_amount = amount*0.82;
                                break;
                            default:final_amount =0.0;
                        }
                        break;
                    
                        case "Rupees": switch(b)
                        {
                            case "USD": final_amount=amount*0.014;
                                break;
                            case "Rupees":final_amount = amount;
                                break;
                            case "Pounds":final_amount = amount*0.0097;
                                break;
                            case "Euros":final_amount = amount*0.011;
                                break;
                            default:final_amount =0.0;
                        }
                        break;
                    
                        case "Pounds": switch(b)
                        {
                            case "USD": final_amount=amount*1.41;
                                break;
                            case "Rupees":final_amount = amount*103.24;
                                break;
                            case "Pounds":final_amount = amount;
                                break;
                            case "Euros":final_amount = amount*1.16;
                                break;
                            default:final_amount =0.0;
                        }
                        break;
                    
                        case "Euros": switch(b)
                        {
                            case "USD": final_amount=amount*1.22;
                                break;
                            case "Rupees":final_amount = amount*89.08;
                                break;
                            case "Pounds":final_amount = amount*0.86;
                                break;
                            case "Euros":final_amount = amount;
                                break;
                            default:final_amount =0.0;
                        }
                        break;
                        
                        default:final_amount=0.0;
                    }
               
                    String value = String.format("%.2f",final_amount);
             
                    ta2.setText(value);
                }     
            });  
        
            btn2.setOnAction(new EventHandler<ActionEvent>() 
            {
                @Override
                public void handle(ActionEvent arg0) 
                {  
                    // TODO Auto-generated method stub
                    c1.setValue("Select");
                    c2.setValue("Select");
                    ta1.setText("");
                    ta2.setText("");
                }
            });    
        }
        
    public static void main (String[] args)  
    {  
        launch(args);  
    }  
}