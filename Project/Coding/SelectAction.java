/**
 * This is class for the scene select action.
 * The user have to choose what action they want to make. 
 * Depending on what the user choose, it will bring the user to the next scene.
 * There are 3 choices that is change password, register new member, and see all the list of the members.
 */

package project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class SelectAction extends Scene {

	static BorderPane bp = new BorderPane();

	public SelectAction(BorderPane bp, int a, int b) {
		super(bp, a, b);
		this.bp = bp;

		// create a label
		Label labelSelectAction = new Label("Please select an action: ");

		// create radio button for user to select what action
		RadioButton rbRegistration = new RadioButton("Register New Member");
		RadioButton rbViewMember = new RadioButton("View All Member");
		RadioButton rbChangePW = new RadioButton("Change Password");
		ToggleGroup actionGroup = new ToggleGroup();
		rbRegistration.setToggleGroup(actionGroup);
		rbViewMember.setToggleGroup(actionGroup);
		rbChangePW.setToggleGroup(actionGroup);

		// create a button
		Button btnConfirm = new Button("Confirm");
		Button btnLogout = new Button("Logout");

		// create a vertical box
		VBox vb = new VBox(15);

		vb.getChildren().addAll(labelSelectAction, rbRegistration, rbViewMember, rbChangePW);

		// set the action for the button
		btnConfirm.setOnAction(e -> {

			if (rbRegistration.isSelected())
				MainPage.stage.setScene(MainPage.partA);
			else if (rbViewMember.isSelected())
				MainPage.stage.setScene(MainPage.viewMember);
			else
				MainPage.stage.setScene(MainPage.newPassword);

		});

		// set the action for button logout, and will go back to login page if click
		btnLogout.setOnAction(e -> {
			MainPage.stage.setScene(MainPage.login);
		});

		// create HBox for the button at bottom
		HBox hb = new HBox();
		hb.getChildren().addAll(btnConfirm, btnLogout);
		btnConfirm.setAlignment(Pos.BOTTOM_RIGHT);

		// assign all the elements to the border pane, and set it to the right place
		bp.setCenter(vb);
		bp.setBottom(hb);
		bp.setAlignment(vb, Pos.TOP_CENTER);
		bp.setAlignment(hb, Pos.BOTTOM_RIGHT);
		bp.setPadding(new Insets(250, 50, 25, 50));

	}

} // end of class Scene2
