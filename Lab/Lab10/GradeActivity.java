/**
* Author : Muhammad Harith bin Zainudin
* Matric : 192171
* Email : mhrbzd@gmail.com
* Mobile : 0193326091
* Date : 3 May 2018
* Course Code : SSK3101
* Course Name : Computer Programming II
* Semester : 2
* Session : 2017/2018
* Lab : 10 + lab test
* Description : This program is to launch the program
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.event.*;
import javafx.scene.input.*;

public class GradeActivity extends Application {
	
	Grade grade = new Grade();
	
	public void start(Stage primaryStage){
		//create borderPane
		BorderPane bp1 = new BorderPane (); //create a new borderPane
		Label label1 = new Label("GRADING ACTIVITY"); //create a new Label and name it
		bp1.setTop(label1); //put the label1 to the top of the borderPane
		bp1.setAlignment(label1,Pos.CENTER); //set the alignment of the top of the borderPane to the center
		
		GridPane grid1 = new GridPane(); //create a new GridPane
		grid1.setHgap(5.5);
		grid1.setVgap(7);
		grid1.add(new Label("Grammar"), 0, 0);
		grid1.add(new Label("Spelling"), 0, 1);
		grid1.add(new Label("Length"), 0, 2);
		grid1.add(new Label("Content"), 0, 3);
		grid1.add(new Label("Total"), 0, 4);
		grid1.add(new Label("Grade"), 0, 5);
		
		//TextField for grammar and set it in the grid pane
		TextField grammarTf = new TextField();
		grid1.add(grammarTf,1,0);
		grammarTf.setPrefWidth(1);
		
		//TextField for spelling and set it in the grid pane
		TextField spellingTf = new TextField();
		grid1.add(spellingTf,1,1);
		
		//TextField for length and set it in the grid pane
		TextField lengthTf = new TextField ();
		grid1.add(lengthTf,1,2);
		
		//TextField for content and set it in the grid pane
		TextField contentTf = new TextField();
		grid1.add(contentTf,1,3);
		
		//TextField for total and set it to the grid pane
		TextField totalTf = new TextField();
		grid1.add(totalTf, 1, 4);
		totalTf.setDisable(true); //set the textfield so that no one can edit
		
		//textfield for grade and set it to the gridpane
		TextField gradeTf = new TextField ();
		grid1.add(gradeTf, 1, 5);
		gradeTf.setDisable(true);
		
		Button process = new Button("Process");
		
		//put the gridPane to the center of the borderPane
		bp1.setCenter(grid1);
		grid1.setAlignment(Pos.TOP_CENTER);
		
		//create horizontal box for the button
		HBox horBtn = new HBox();
		
		//create the button process and exit
		Button processBtn = new Button("Process");
		Button exitBtn = new Button("Exit");
		horBtn.getChildren().add(processBtn);
		horBtn.getChildren().add(exitBtn);
		horBtn.setPadding(new Insets(15, 15, 15, 15));
		horBtn.setAlignment(Pos.TOP_CENTER);
		bp1.setBottom(horBtn); //set all the button to the bottom of the border pane
		
		//set the action for grammar if the user give input to the textfield
		grammarTf.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle (KeyEvent event) {
				grade.setGrammar(Double.parseDouble(grammarTf.getText()));
			}
		});
		
		//set the action for spelling if the user give input to the textfield
		spellingTf.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle (KeyEvent event) {
				grade.setSpelling(Double.parseDouble(spellingTf.getText()));
			}
		});
		
		//set the action for length if the user give input to the textfield
		lengthTf.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle (KeyEvent event) {
				grade.setCorrectL(Double.parseDouble(lengthTf.getText()));
			}
		});
				
		//set the action for content if the user give input to the textfield
		contentTf.setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle (KeyEvent event) {
				grade.setContent(Double.parseDouble(contentTf.getText()));
			}
		});
		
		
		//add action for button exit
		exitBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				primaryStage.close();
			}
		});
		
		processBtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//update
				totalTf.setText(String.valueOf(grade.getTotal()));
				gradeTf.setText(grade.getGrade());
			}
		});
		
	//create a scene and place it on the stage
		Scene scene1 = new Scene (bp1, 300,350);
		primaryStage.setTitle("Grading");
		primaryStage.setScene(scene1);
		primaryStage.show();
	} //end of start
	
	//launch the stage
	public static void main(String[] args) {
		launch(args);
	}

} // end of public class GradeActivity
