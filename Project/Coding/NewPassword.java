/**
 * This is a class for Scene 3 as known as the scene for the user to enter the new password
 * The password will be updated if the user enter the new password
 * After the user have enter the new password, it will bring back the user to the select action scene.
 */

package project;

import static javafx.application.Application.launch;

import javax.swing.JOptionPane;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NewPassword extends Scene {

	static GridPane pane = new GridPane();
	static String pw1 = new String();

	public NewPassword(GridPane pane, int a, int b) {
		super(pane, a, b);
		this.pane = pane;

		// Create a pane and set its properties
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(20, 20, 20, 20));
		pane.setHgap(10);
		pane.setVgap(10);

		// create message label
		Label Message = new Label();
		// Place nodes in the pane
		pane.add(new Label("New password:"), 0, 0);
		PasswordField pf = new PasswordField();
		pane.add(pf, 0, 1);
		pane.add(new Label("Confirm new password:"), 0, 3);
		PasswordField pf1 = new PasswordField();
		pane.add(pf1, 0, 4);
		pane.add(Message, 1, 1, 3, 1);
		Button btAdd = new Button("Confirm");
		pane.add(btAdd, 1, 6);
		GridPane.setHalignment(btAdd, HPos.RIGHT);

		// set action for button
		btAdd.setOnAction(e -> {

			String pw1 = pf.getText();
			String pw2 = pf1.getText();
			if (pw1.equals(pw2)) {
				pw1 = Login.password;
				JOptionPane.showMessageDialog(null, "Password has been changed.", null,
						JOptionPane.INFORMATION_MESSAGE);
				MainPage.stage.setScene(MainPage.selectAction);
			} else
				Message.setText("Password not match");
		});

	}

} // end of class new password
