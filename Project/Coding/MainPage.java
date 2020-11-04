/**
 * This is the class where the main stage is.
 */

package project;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainPage extends Application {

	static MainPage mainPage = new MainPage();
	static Login login = new Login(Login.borderP1, 300, 200);
	static SelectAction selectAction = new SelectAction(SelectAction.bp, 800, 600);
	static NewPassword newPassword = new NewPassword(NewPassword.pane, 800, 600);
	static PartA partA = new PartA(PartA.bp, 850, 900);
	static PartB partB = new PartB(PartB.borderRegister, 1000, 600);
	static UploadPicture uploadPicture = new UploadPicture(UploadPicture.bpUpload, 1000, 600);
	static ViewMember viewMember = new ViewMember(ViewMember.vbnamelist, 1000, 600);
	static Stage stage = new Stage();

	public void start(Stage primaryStage) {
		// set the title of the stage, scene and show the stage
		stage.setTitle("Membership Management");
		stage.setScene(login);
		stage.show();

	}

	// main method
	public static void main(String[] args) throws IOException {
		launch(args);
	}

} // end of class MainPage
