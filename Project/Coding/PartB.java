/**
 * This is a class for the form part B
 * This scene is from part A form
 * Part B is the form where the user have to enter the information regarding the work
 * The user also can go to previous part A form to edit back.
 * If the user click next, all the information will be saved and this will bring the user to the upload picture scene
 * 
 */
package project;

import java.io.File;
import java.io.*;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class PartB extends Scene {
	static int memberNO = 0;
	static BorderPane borderRegister = new BorderPane();

	public PartB(BorderPane borderRegister, int a, int b) {

		super(borderRegister, a, b);

		this.borderRegister = borderRegister;
		VBox vbox = new VBox(); // create vertical box for top pane of border pane
		HBox horBox1 = new HBox(); // create horizontal box for the patient name and also the text field
		vbox.getChildren().addAll(new Label("Register Form"));
		borderRegister.setTop(vbox);
		horBox1.setAlignment(Pos.CENTER);// Setting the allignment of the grading activity at the centre
		vbox.setAlignment(Pos.CENTER);

		// Creating a grid pane to insert (LABEL,TEXTFIELD)
		GridPane gridP1 = new GridPane();
		gridP1.setAlignment(Pos.CENTER); // allow textfield and labels to be at the center
		gridP1.setVgap(15);// Allow the textfield to have gap vertically
		gridP1.setHgap(30); // Allow the textfield to have gap with the label horizontally

		Text PtB = new Text(" Part B : Job Information :  ");

		horBox1.getChildren().addAll(PtB);// adding all the text and textfield in horbox
		vbox.getChildren().add(horBox1);

		// Creating the Label for the grammar, spelling, Correct Length and content
		// attributes
		Label L1 = new Label("Staff Number : ");
		TextField tf1 = new TextField();
		gridP1.add(L1, 0, 0);
		gridP1.add(tf1, 1, 0);
		// set all to uppercase when user enter input
		tf1.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		Label L2 = new Label("Division/PTJ :");
		TextField tf2 = new TextField();
		gridP1.add(L2, 0, 1);
		gridP1.add(tf2, 1, 1);
		// set to all uppercase when user enter input
		tf2.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		Label L3 = new Label("Email :");
		TextField tf3 = new TextField();
		gridP1.add(L3, 0, 2);
		gridP1.add(tf3, 1, 2);
		// set to all uppercase when user enter input
		tf3.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		Label L4 = new Label("Office Phone Number : ");
		TextField tf4 = new TextField();
		gridP1.add(L4, 0, 3);
		gridP1.add(tf4, 1, 3);
		// set the limit that user can enter for office phone number
		tf4.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d{0,10}?")) {
					tf4.setText(oldValue);
				}
			}
		});

		Label L5 = new Label("Office Address  : ");
		TextField tf5 = new TextField();
		TextField tf6 = new TextField();
		gridP1.add(L5, 0, 4);
		gridP1.add(tf5, 1, 4);
		gridP1.add(tf6, 1, 5);
		// set tf5 to use all uppercase when user enter input
		tf5.setPrefColumnCount(20); // Setting the length for the length of the textfield
		tf5.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));
		// set tf6 to uppercase
		tf6.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		Label L7 = new Label("State : ");
		TextField tf7 = new TextField();
		gridP1.add(L7, 0, 6);
		gridP1.add(tf7, 1, 6);
		// set tf7 to uppercase
		tf7.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		Label L8 = new Label("Mobile Phone Number  :");
		TextField tf8 = new TextField();
		gridP1.add(L8, 2, 2);
		gridP1.add(tf8, 3, 2);
		// set the limit for the user to enter for mobile phone number
		tf8.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d{0,11}?")) {
					tf8.setText(oldValue);
				}
			}
		});

		Label L9 = new Label("Postcode : ");
		TextField tf9 = new TextField();
		gridP1.add(L9, 2, 6);
		gridP1.add(tf9, 3, 6);
		// set the limit for the postcode that is 5
		tf9.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d{0,5}?")) {
					tf9.setText(oldValue);
				}
			}
		});

		Label L10 = new Label("Country ;");
		TextField tf10 = new TextField();
		gridP1.add(L10, 2, 7);
		gridP1.add(tf10, 3, 7);
		// set tf10 to uppercase
		tf10.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		Label L11 = new Label("District :");
		TextField tf11 = new TextField();
		gridP1.add(L11, 0, 7);
		gridP1.add(tf11, 1, 7);
		borderRegister.setCenter(gridP1);
		// set tf11 to uppercase
		tf11.setTextFormatter(new TextFormatter<>((change) -> {
			change.setText(change.getText().toUpperCase());
			return change;
		}));

		// Creating the process and exit button inside the HBox
		HBox hbox = new HBox(15); // Making space horizontally between process and exits buttons
		Button btNext = new Button("Next");
		Button btPrevious = new Button("Previous");

		// When user clicks at the button Process , it will then proceed to the next
		// scene
		btNext.setOnAction(e -> {
			File memberFile = new File("member" + memberNO++ + ".txt");
			try {
				memberFile.createNewFile();

				PrintWriter writeMember = new PrintWriter(memberFile);
				writeMember.println(PartA.cbHonTitle.getValue());
				writeMember.println(PartA.tfName.getText());
				writeMember.println(PartA.tfIC.getText());
				writeMember.println(PartA.cbGender.getValue());
				writeMember.println(PartA.tfDOB.getText());
				writeMember.print(PartA.tfPlaceBirth.getText());
				writeMember.println(PartA.cbReligion.getValue());
				writeMember.println(PartA.cbRace.getValue());
				writeMember.println(PartA.tfAddress.getText());
				writeMember.println(PartA.tfDistrict.getText());
				writeMember.println(PartA.tfPostcode.getText());
				writeMember.println(PartA.tfState.getText());
				writeMember.println(PartA.tfCountry.getText());
				writeMember.println(PartA.cbMarital.getValue());
				writeMember.println(PartA.cbCitizenship.getValue());

				// information in Part B
				writeMember.println(tf1.getText());
				writeMember.println(tf2.getText());
				writeMember.println(tf3.getText());
				writeMember.println(tf8.getText());
				writeMember.println(tf4.getText());
				writeMember.println(tf5.getText());
				writeMember.println(tf6.getText());
				writeMember.println(tf11.getText());
				writeMember.println(tf9.getText());
				writeMember.println(tf7.getText());
				writeMember.println(tf10.getText());

				writeMember.close();
				JOptionPane.showMessageDialog(null, "Member Information Saved Successfully" + memberFile.getName(),
						null, JOptionPane.INFORMATION_MESSAGE);
				MainPage.stage.setScene(MainPage.uploadPicture);
			} catch (Exception e1) {
				e1.printStackTrace();
				// ignore error otherwise, if we can safely do so.
			}

		});

		// When user clicks at the button Process , it will then go back to the previous
		// scene
		btPrevious.setOnAction((ActionEvent event) -> {
			MainPage.stage.setScene(MainPage.partA);

		});
		hbox.getChildren().addAll(btNext, btPrevious);// Adding the button into the hbox
		borderRegister.setBottom(hbox); // Setting both of the exits and process buttons at the bottom of the pane
		hbox.setAlignment(Pos.CENTER); // Setting the buttons so that it will be at the centre of the pane
		hbox.setPadding(new Insets(0, 0, 15, 0)); // Making space for the buttons from the bottom

	}

}
