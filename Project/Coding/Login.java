/**
 * This is a classthe login page for the system.
 * If the user enter using the default password, it will bring the user to the select action scene.
 * If wrong password is enter, the user cannot login.
 */

package project;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Scene {

	static BorderPane borderP1 = new BorderPane();
	static String password = new String();

	public Login(BorderPane borderP1, int a, int b) {

		super(borderP1, a, b);
		this.borderP1 = borderP1;

		VBox vbox = new VBox(15); // create vertical box for top pane of border pane and 15 is the gap between
		HBox horBox1 = new HBox(15); // create horizontal box and also the text field
		// BorderPane borderP1 = new BorderPane();
		borderP1.setTop(vbox);
		vbox.getChildren().add(new javafx.scene.control.Label("Enter Password"));
		horBox1.setAlignment(Pos.CENTER);// Setting the allignment of the Billing Account at the centre
		vbox.setAlignment(Pos.CENTER);

		// create new label
		Label Message = new Label();

		// set the initial password
		password = "1234";

		// Created a grid pane to enter the textfield and all the label
		GridPane gridP1 = new GridPane();
		gridP1.setAlignment(Pos.CENTER); // allow textfield and labels to be at the center
		gridP1.setVgap(15);// Allow the textfield to have gap vertically
		gridP1.setHgap(30); // Allow the textfield to have gap with the label horizontally
		gridP1.add(Message, 1, 1, 3, 1);

		// Inserting the textfield to allow user to enter the password (pw1 stands for
		// password)
		PasswordField tfPassword = new PasswordField();
		tfPassword.setPrefColumnCount(10);

		// Adding the password in the vbox - vertical!
		vbox.getChildren().addAll(tfPassword);// adding all the text and textfield in horbox
		vbox.setPadding(new Insets(15, 15, 15, 15)); // padding to make sure gap between the textfield and the box

		// Set the grid at the centre of the border
		borderP1.setCenter(gridP1);

		HBox hbox = new HBox(15); // Making space horizontally between process and exits buttons
		Button btExit = new Button("Exit"); // Create the button exit
		Button btLogin = new Button("Login"); // Create the button login

		horBox1.getChildren().addAll(btLogin, btExit);// Adding the button into the hbox
		borderP1.setBottom(horBox1); // Setting both of the exits and process buttons at the bottom of the pane
		horBox1.setAlignment(Pos.CENTER); // Setting the buttons so that it will be at the centre of the pane
		horBox1.setPadding(new javafx.geometry.Insets(0, 0, 15, 0)); // setting the buttons 15 distance from the bottom

		btExit.setOnAction((ActionEvent event) -> {
			// once click, the method for button exit
			System.exit(0);
		});

		btLogin.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				Message.setStyle("-fx-text-fill: red;");
				String password1 = tfPassword.getText();

				// set the rules fo user to enter password so that it will not empty
				if (password1.equals("")) {
					Message.setText("Please enter the password");
				} else if (password1.equals(password)) {
					Message.setStyle("-fx-text-fill: green;");
					password = NewPassword.pw1;
					JOptionPane.showMessageDialog(null, "Successfully login.", null, JOptionPane.INFORMATION_MESSAGE);
					MainPage.stage.setScene(MainPage.selectAction);
				} else {
					Message.setStyle("-fx-text-fill: red;");
					Message.setText("Incorrect password");
				}

			}

		});

	}

} // end of class login
