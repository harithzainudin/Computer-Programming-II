import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.geometry.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class ElectricBilling extends Application {
	
	public void start (Stage primaryStage) {
		
		//create label for the left side
	    Label left1 = new Label("Previous meter reading (kWh) :");
	    Label left2 = new Label("Current meter reading (kWh) :");
	    Label left3 = new Label("Type of account :");
	    Label left4 = new Label("Amount that have to pay (RM) :");
	    
	    //create textfield and radio button for the right side
	    TextField tf1 = new TextField ();
	    TextField tf2 = new TextField ();
	    ChoiceBox cb = new ChoiceBox (FXCollections.observableArrayList("Fix Rate Method", "Variable Rate Method"));
	    TextField tf3 = new TextField ();
	    
	    //put left1, left2, left3 and left4 to vertical box
	    VBox vb = new VBox(left1, left2, left3, left4);
	    vb.setSpacing(27);
	    vb.setAlignment(Pos.CENTER);
	    
	    //put tf1, tf2, tf3 and cb to vertical box
	    VBox vb1 = new VBox(tf1, tf2, cb, tf3);
	    vb1.setSpacing(15);
	    vb1.setAlignment(Pos.CENTER);
	    
	    //create textfield and radio button for the right side
	    
		//create a vbox pane. Then, put the label to the top of the borderpane, and also align it to the center	
		BorderPane bp = new BorderPane();
		Label label = new Label ("THIS IS A PROGRAM TO CALCULATE THE AMOUNT FOR YOU \n\t TO PAY FOR YOUR ELECTRICAL CONSUMPTION");
		bp.setTop(label);
		
		//put vb vb1 to the center of the borderpane and align it
		bp.setCenter(vb);
		bp.setRight(vb1);
		
		//set the padding for the border pane
		bp.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		//create button
		Button calBtn = new Button("Calculate");
		Button exitBtn = new Button("Exit");
		
		//create the horizontal box for the button and pin it to the bottom of the borderpane
		HBox hb = new HBox(5);
		hb.getChildren().add(calBtn);
		hb.getChildren().add(exitBtn);
		bp.setBottom(hb);
		hb.setAlignment(Pos.TOP_CENTER);
		
		//add action for button exit
		exitBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				primaryStage.close();
			}
		});

		calBtn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	Billing bill = new Billing ();
                //call the value that been written in text field
                double previous = Double.valueOf(tf1.getText());
                double current = Double.valueOf(tf2.getText());
                Object type = cb.getValue();
                double total = bill.getTotal(previous, current, type);
                tf3.setText(String.valueOf(total));
            }

        });
		
		//create a scene and place it on a stage
		Scene scene = new Scene(bp, 450, 400);
		primaryStage.setTitle("Electric Billing");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	} //end of method start
	
	//launch the stage
	public static void main(String[] args) {
		launch(args);
	} //end of main method
	
} //end of class ElectricBilling
